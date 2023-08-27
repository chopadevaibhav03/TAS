import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.LinkedList;

public class SnakeGame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Snake Game");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new SnakePanel());
            frame.pack();
            frame.setVisible(true);
        });
    }
}

class SnakePanel extends JPanel implements KeyListener {
    private static final int GRID_SIZE = 20;
    private static final int GAME_WIDTH = 400;
    private static final int GAME_HEIGHT = 400;
    private static final int DELAY = 150;

    private LinkedList<Point> snake;
    private Point food;
    private int direction;
    private boolean running;

    public SnakePanel() {
        setPreferredSize(new Dimension(GAME_WIDTH, GAME_HEIGHT));
        setBackground(Color.BLACK);
        setFocusable(true);
        addKeyListener(this);

        startGame();
    }

    private void startGame() {
        snake = new LinkedList<>();
        snake.add(new Point(GAME_WIDTH / 2, GAME_HEIGHT / 2));
        direction = KeyEvent.VK_RIGHT;
        spawnFood();
        running = true;

        ActionListener gameLoop = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (running) {
                    move();
                    checkCollision();
                    repaint();
                }
            }
        };

        new Timer(DELAY, gameLoop).start();
    }

    private void move() {
        Point newHead = (Point) snake.getFirst().clone();

        switch (direction) {
            case KeyEvent.VK_UP:
                newHead.translate(0, -GRID_SIZE);
                break;
            case KeyEvent.VK_DOWN:
                newHead.translate(0, GRID_SIZE);
                break;
            case KeyEvent.VK_LEFT:
                newHead.translate(-GRID_SIZE, 0);
                break;
            case KeyEvent.VK_RIGHT:
                newHead.translate(GRID_SIZE, 0);
                break;
        }

        snake.addFirst(newHead);

        if (newHead.equals(food)) {
            spawnFood();
        } else {
            snake.removeLast();
        }
    }

    private void spawnFood() {
        int foodX = (int) (Math.random() * (GAME_WIDTH / GRID_SIZE)) * GRID_SIZE;
        int foodY = (int) (Math.random() * (GAME_HEIGHT / GRID_SIZE)) * GRID_SIZE;
        food = new Point(foodX, foodY);
    }

    private void checkCollision() {
        Point head = snake.getFirst();

        if (head.x < 0 || head.x >= GAME_WIDTH || head.y < 0 || head.y >= GAME_HEIGHT) {
            running = false;
        }

        for (int i = 1; i < snake.size(); i++) {
            if (head.equals(snake.get(i))) {
                running = false;
                break;
            }
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (running) {
            g.setColor(Color.GREEN);
            for (Point p : snake) {
                g.fillRect(p.x, p.y, GRID_SIZE, GRID_SIZE);
            }

            g.setColor(Color.RED);
            g.fillRect(food.x, food.y, GRID_SIZE, GRID_SIZE);
        } else {
            g.setColor(Color.WHITE);
            g.setFont(new Font("Arial", Font.BOLD, 20));
            g.drawString("Game Over", GAME_WIDTH / 2 - 60, GAME_HEIGHT / 2);
        }
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
        int newDirection = e.getKeyCode();

        if ((newDirection == KeyEvent.VK_UP && direction != KeyEvent.VK_DOWN) ||
                (newDirection == KeyEvent.VK_DOWN && direction != KeyEvent.VK_UP) ||
                (newDirection == KeyEvent.VK_LEFT && direction != KeyEvent.VK_RIGHT) ||
                (newDirection == KeyEvent.VK_RIGHT && direction != KeyEvent.VK_LEFT)) {
            direction = newDirection;
        }
    }

    public void keyReleased(KeyEvent e) {
    }
}
