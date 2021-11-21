package Turtle;
import java.util.Objects;

public class Position {
        private int rowPosition;
        private int columnPosition;
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Position position = (Position) o;
//        return rowPosition == position.rowPosition && columnPosition == position.columnPosition;
//    }


        @Override
        public String toString() {
            return "Position{" +
                    "rowPosition=" + rowPosition +
                    ", columnPosition=" + columnPosition +
                    '}';
        }
//
//    @Override
//    public boolean equals(Object o){
//
//        Position comparedPosition = (Position) o;
//        //if (this == comparedPosition)
//
//        if(columnPosition==comparedPosition.columnPosition && rowPosition == comparedPosition.rowPosition)
//
//        return false;
//
//    }


        @Override
        public boolean equals(Object o) {

            if (this == o) {
                return true;
            }
            if (!(o instanceof Position positionToBeCompared)) {
                return false;
            }
            boolean rowsAreEqual = rowPosition == positionToBeCompared.rowPosition;
            boolean columnsAreEqual = columnPosition == positionToBeCompared.columnPosition;
            return rowsAreEqual && columnsAreEqual;
        }


        public Position(int rowPosition, int columnPosition) {
            this.columnPosition = columnPosition;
            this.rowPosition = rowPosition;
        }

        public void increaseColumnPositionBy(int numberOfSteps) {
            columnPosition += numberOfSteps;
        }

        public int getColumnPosition() {
            return columnPosition;
        }

        public void setColumnPosition(int columnPosition) {
            this.columnPosition = columnPosition;
        }

        public int getRowPosition() {
            return rowPosition;
        }
    }

