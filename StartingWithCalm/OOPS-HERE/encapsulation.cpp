#include<iostream>
#include<string>
using namespace std;


class SportsCar {
    private:
        // characters
        string brand;
        string model;
        bool isEngineOn;
        int currentSpeed;
        int currentGear;
        string tyre;


    public: 
        // behaviours
        SportsCar(string b, string m) {
            this->brand = b;
            this->model = m;
            isEngineOn = false;
            currentSpeed = 0;
            currentGear = 0;
            tyre = "MRF";
        }


        // getter and setters -> these are used to get the access of private data members of class through which we can perform some of the validations.

        int getCurrentSpeed() {
            return this->currentSpeed;
        }


        string getTyre() {
            return this->tyre;
        }

        void setTyre(string tyre) {
            this->tyre = tyre;
        }

        SportsCar(string b, string m) {
            this->brand = b;
            this->model = m;
            isEngineOn = false;
            currentSpeed = 0;
            currentGear = 0; //neutral
        };

        void startEngine() {
            isEngineOn = true;
            cout << brand << " " << model << " : Engine starts with a roar!" << endl;
        }

        void shiftGear(int gear) {
            if(!isEngineOn) {
                cout << brand << " " << model << " : Engine is off! Cannot Shift Gear." << endl;
                return;
            }

            currentGear = gear;
            cout << brand << " " << model << " :  Shifted to gear " << currentGear << endl; 
        }


        void accelerate() {
            if(!isEngineOn) {
                cout << brand << " " << model << " : Engine is off! Cannot accelerate." << endl;
                return;
            }

            currentSpeed += 20;
            cout << brand << " " << model << " : Accelerating to " << currentSpeed << " km/h" << endl;
        }


        void brake() {
            currentSpeed -= 20;
            if(currentSpeed < 20)  currentSpeed = 0;
            cout << brand << " " << model << " : Braking! Speed is now " << currentSpeed << " km/h" << endl;
        }

        void stopEngine() {
            isEngineOn = false;
            currentGear = 0;
            currentSpeed = 0;

            cout << brand << " " << model << " : Engine turned off." << endl;
        }

};



int main() {


    SportsCar* myCar = new SportsCar("Ford", "Mustang");
    
    

    // setting arbitary value to speed
    // myCar->currentSpeed = 100;  this is not possible cause right it is private which provide some sort of data security through access modifiers.
}