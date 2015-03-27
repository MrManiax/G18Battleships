package mainLoop;

import gameLogic.grid;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class Panel extends JPanel {

    private int columnCount;
    private int rowCount;
    private Point selectedField;
    private grid grid;

    public Panel(grid grid) {
    	
    	this.grid = grid;
    	columnCount = this.grid.getColCount();
    	rowCount = this.grid.getRowCount();
        MouseAdapter mouseHandler;

        
        mouseHandler = new MouseAdapter() { 
            public void mousePressed(MouseEvent me) { 
            	Point point = me.getPoint();

                int width = getWidth();
                int height = getHeight();

                int cellWidth = width / columnCount;
                int cellHeight = height / rowCount;

                int column = me.getX() / cellWidth;
                int row = me.getY() / cellHeight;

                selectedField = new Point(column, row);
                repaint();
            } 
          }; 
        addMouseListener(mouseHandler);
    }

    public Point getSelectedField() {
		return selectedField;
	}

	public void setSelectedField(Point selectedField) {
		this.selectedField = selectedField;
	}

	public int getColumnCount() {
		return columnCount;
	}

	public void setColumnCount(int columnCount) {
		this.columnCount = columnCount;
	}

	public int getRowCount() {
		return rowCount;
	}

	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}

	@Override
    public Dimension getPreferredSize() {
        return new Dimension(200, 200);
    }

    @Override
    public void invalidate() {
        //cells.clear();
        selectedField = null;
        super.invalidate();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();

        int width = getWidth();
        int height = getHeight();

        int cellWidth = width / columnCount;
        int cellHeight = height / rowCount;

        int xOffset = (width - (columnCount * cellWidth)) / 2;
        int yOffset = (height - (rowCount * cellHeight)) / 2;

        //if (cells.isEmpty()) {
            for (int row = 0; row < rowCount; row++) {
                for (int col = 0; col < columnCount; col++) {
                	this.grid.grid[row][col].initRect(
                            xOffset + (col * cellWidth),
                            yOffset + (row * cellHeight),
                            cellWidth,
                            cellHeight);
                    //cells.add(cell);
                }
            }
        //}

        

        
        for (int i = 0; i < columnCount; i++) {
        	for (int j = 0; j < columnCount; j++) {
        		
        		switch (this.grid.grid[i][j].getType()) {
        		case 'e':
					
					break;
				case 's':
					
					break;
				case 'h':
					g2d.setColor(Color.RED);
	                g2d.fill(this.grid.grid[i][j].rect);
					break;
				case 'm':
					g2d.setColor(Color.BLUE);
	                g2d.fill(this.grid.grid[i][j].rect);
					break;
				default:
					break;
				}
        		g2d.setColor(Color.GRAY);
        		g2d.draw(this.grid.grid[i][j].rect);
        	}
        }
        
        
        
        
    }
}

