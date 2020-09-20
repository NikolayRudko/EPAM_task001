package com.epam.task.first.entity;

public class Point {
    private double coordinateX;
    private double coordinateY;

    public Point(double coordinateX, double coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public double getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(double coordinateX) {
        this.coordinateX = coordinateX;
    }

    public double getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(double coordinateY) {
        this.coordinateY = coordinateY;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        Point point = (Point) obj;

        return comparisonDoubleWithAccuracy(coordinateX, point.coordinateX)
                && comparisonDoubleWithAccuracy(coordinateY, point.coordinateY);
        // return coordinateX == point.coordinateX && coordinateY == point.coordinateY;
    }

    private boolean comparisonDoubleWithAccuracy(double numberA, double numberB) {
        final double DELTA = 1e-5;
        return Math.abs(numberA - numberB) < DELTA;
    }

    @Override
    public int hashCode() {
        return Long.valueOf(Double.doubleToLongBits(coordinateX)).hashCode() +
                Long.valueOf(Double.doubleToLongBits(coordinateY)).hashCode();
    }

    @Override
    public String toString() {
        return String.format("Coordinate X = %f, coordinate Y = %f", coordinateX, coordinateY);
    }
}
