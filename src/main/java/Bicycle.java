public class Bicycle {

    public abstract class Bike{
        private String color;
        private String gender;
        private int size;
        private int age;
        private int wheel;
        private int pedal;
        private int handleBar;
        private int gear;
        private int spoke;
        private int seat;
        private int breaks;
        private int frontReflector;
        private int backReflector;
        private boolean trainingWheels;
        private boolean horn;



        public String brake() {
            return "Stop bicycle";
        }


        public String pedal() {
            return "Bike in motion";
        }

        public String gearShift(int num) {
            return "You are in " + num + " gear";
        }

    }

    public class MountBike extends Bike{

    }

    public class RoadBike extends Bike{

    }

    public class Trike extends Bike{

    }
}
