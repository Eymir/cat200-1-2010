package RestOrdSystem;

import javax.swing.table.AbstractTableModel;

public class TableModel extends AbstractTableModel {

	private String[] columnNames;
    private Object[][] data;
    int rows;
    int columns;

    public TableModel(){
        rows = 0;
        columns = 0;
    }

    public void setDataSize(int i, int j){
        rows = i;
        columns = j;
        data = new Object[rows][columns];
    }

    public void setColumnNameSize(){
        columnNames = new String[columns];
    }

    public void setColumnName(int count, String name){
        columnNames[count] = name;
    }

    public void addString(int i, int j, String info){
        data[i][j] = info;
    }

    public int getColumnCount() {
        return columns;
    }

    public int getRowCount() {
        return rows;
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
        return data[row][col];
    }
}
