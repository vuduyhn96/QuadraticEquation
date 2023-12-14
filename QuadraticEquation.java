public class QuadraticEquation {
        // Thuộc tính
        private double a, b, c;

        // Phương thức khởi tạo
        public QuadraticEquation(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        // Phương thức getter cho a
        public double getA() {
            return a;
        }

        // Phương thức getter cho b
        public double getB() {
            return b;
        }

        // Phương thức getter cho c
        public double getC() {
            return c;
        }

        // Phương thức tính delta
        public double getDiscriminant() {
            return b * b - 4 * a * c;
        }

        // Phương thức tính nghiệm 1
        public double getRoot1() {
            double delta = getDiscriminant();
            if (delta >= 0) {
                return (-b + Math.pow(delta, 0.5)) / (2 * a);
            } else {
                return 0; // Nghiệm không hợp lệ khi delta < 0
            }
        }

        // Phương thức tính nghiệm 2
        public double getRoot2() {
            double delta = getDiscriminant();
            if (delta >= 0) {
                return (-b - Math.pow(delta, 0.5)) / (2 * a);
            } else {
                return 0; // Nghiệm không hợp lệ khi delta < 0
            }
        }
}


