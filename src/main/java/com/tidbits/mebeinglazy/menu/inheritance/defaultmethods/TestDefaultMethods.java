package com.tidbits.mebeinglazy.menu.inheritance.defaultmethods;

public class TestDefaultMethods implements RoadVehicle,AirVehicle{
    @Override
    public int getWheels(String vehicle) {
        if (vehicle == "Car"){
            return 4;
        }else if(vehicle == "Bike"){
            return 2;
        }else if (vehicle == "Plane"){
            return 6;
        }else if (vehicle == "Helicopter"){
            return 4;
        }
    return 0;
    }

    @Override
    public void getSeatingCapacity(int wheels) {
        RoadVehicle.super.getSeatingCapacity(wheels);
    }

    public void getSeatingCapacityRoad(int wheels){
        RoadVehicle.super.getSeatingCapacity(wheels);
    }

    public void getSeatingCapacityAir(int wheels){
        AirVehicle.super.getSeatingCapacity(wheels);
    }


    public static void main(String[] args) {
        String vehicle = "Car";
        Vehicle veh = () ->  vehicle;
        veh.getVehicleName();
        TestDefaultMethods tdm = new TestDefaultMethods();
        int wheels = tdm.getWheels(veh.getVehicleName());
        tdm.getSeatingCapacityRoad(wheels);
        String vehicle1 = "BIKE";
        Vehicle veh1 = () ->  vehicle1;
        veh1.getVehicleName();
        tdm.getSeatingCapacityRoad(wheels);
        String vehicle2 = "Plane";
        Vehicle veh2 = () ->  vehicle2;
        veh2.getVehicleName();
        tdm.getSeatingCapacityAir(wheels);
    }
}
