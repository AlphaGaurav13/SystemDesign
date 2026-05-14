#include<bits/stdc++.h>
using namespace std;

class Car {
    protected:
        string brand;
        string model;
        bool isEngineOn;
        int currentSpeed;
    public:
        Car(string b, string m) {
            this->brand=b;
            this->model=m;
            isEngineOn = false;
            currentSpeed = 0;
        }
        void startEngine() {
            isEngineOn = true;
            cout << brand << " " << model << " : Engine starts with a roar!" << endl;
        }

        void stopEngine() {
            isEngineOn = false;
            currentSpeed = 0;

            cout << brand << " " << model << " : Engine turned off." << endl;
        }

        virtual void accelerate() = 0;
        virtual void brake() = 0;
        virtual ~Car() {};

};


class ManualCar: public Car {
private:
    int currentGear; // specefic to manual car

public:
    ManualCar(string b, string m) : Car(b, m) {
        this->currentGear = 0;
    }

    void shiftGear(int gear) {
        currentGear = gear;
        cout << brand << " " << model << " : shifted to gear" << currentGear << endl;
    }

    // Overriding accelerate - Dynamic Polymorphism
    void accelerate() {
        if(!isEngineOn) {
            cout << brand << " " << model << " : Cannot accelerate! Engine is off." << endl;
            return;
        }
        currentSpeed += 20;

        cout << brand << " " << model << " : Accelerating to " << currentSpeed << endl;
    }


    // overriding brake - Dynamic Polymorphism
    void brake() {
        currentSpeed -= 20;
        if(currentSpeed < 0) currentSpeed = 0;
        cout << brand << " " << model <<  " : Braking! speed is now " << currentSpeed << " km/h" << endl;
    }
};

class ElectricCar: public Car {

private:
    int batteryLevel;

public:
    ElectricCar(string b, string m) : Car(b, m) {
        this->batteryLevel= 100;
    }

    void chargeBattery() {
        batteryLevel = 100;
        cout << brand << " " << model << " : Battery fully charged!" << endl;
    }

    void accelerate() {
        if(!isEngineOn) {
            cout << brand << " " << model << " : Cannot accelerate! Engine is off." << endl;
            return;
        }

        if(batteryLevel <= 0) {
            cout << brand << " " << model << " : Battery is Dead! cannot accelerate." << endl;
            return;
        }
        batteryLevel -= 15;
        currentSpeed += 10;

        cout << brand << " " << model << " : Accelerating to " << currentSpeed << endl;
    }
};


int main() {

    ManualCar* myManualCar = new ManualCar("Suzuki", "WagonR");
    myManualCar->startEngine();
    myManualCar->shiftGear(1);
    myManualCar->accelerate();
    myManualCar->brake();
    myManualCar->stopEngine();
    delete myManualCar;

    cout << "--------------------------------" << endl;


    ElectricCar* myElectricCar = new ElectricCar("Tesla", "Model S");
    myElectricCar->chargeBattery();
    myElectricCar->startEngine();
    myElectricCar->accelerate();
    myElectricCar->brake();
    myElectricCar->stopEngine();
    delete myElectricCar;

}