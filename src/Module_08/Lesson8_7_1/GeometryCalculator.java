package Module_08.Lesson8_7_1;

public class GeometryCalculator {


    public static double getCircleSquare(double radius) {
        if (radius >= 0) {
            return Math.PI * Math.pow(radius, 2);
        } else {
            return -1;
        }
    }


    public static double getSphereVolume(double radius) {
        if (radius > 0.0) {
            return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        }
        if (radius == 0.0) {
            return 0.0;
        }
        if (radius < 0) {
        }
        return -1.0;
    }

    public static boolean isTrianglePossible(double side1, double side2, double side3) {
        return (side1 + side2) >= side3 && (side1 + side3) >= side2 && (side2 + side3) >= side1 && side1 > 0 && side2 > 0 && side3 > 0;
    }

    public static double getTriangleSquare(double side1, double side2, double side3) {
        double area = 0.0;
        if (isTrianglePossible(side1, side2, side3)) {
            double p = (side1 + side2 + side3) / 2.0;
            return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
        } else {
            return -1;
        }
    }
}

