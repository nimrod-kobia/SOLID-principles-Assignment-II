/*  interface Segragation Principle
 This code demonstrates the Interface Segregation Principle by defining specific interfaces for different functionalities
and implementing them in classes that represent different electronic devices.*/
interface Switchable{
    void turnOn();
    void turnOff();
}
interface Chargable{
    void charge();
}
interface TemperatureControllable{
    void setTemperature(int temperature);
}
interface VideoRecordable{
    void recordVideo();
}
interface ColorChangeable{
    void changeColor(String color);
}

class Light implements Switchable,ColorChangeable{
    @Override
    public void turnOn(){
        System.out.println("Light is turned on");

    }
    @Override
    public void turnOff(){
        System.out.println("Light is turned off");
    }
    @Override
    public void changeColor(String color){
        System.out.println("Light color changed to " + color);
    }
}
class Fan implements Switchable,TemperatureControllable{
    @Override
    public void turnOn(){
        System.out.println("Fan is turned on");
    }
    @Override
    public void turnOff(){
        System.out.println("Fan is turned off");
    }
    @Override
    public void setTemperature(int temperature){
        System.out.println("Fan temperature set to " + temperature + " degrees");
    }
}
class SecurityCamera implements Switchable,VideoRecordable{
    @Override
    public void turnOn(){
        System.out.println("Security Camera is turned on");
    }
    @Override
    public void turnOff(){
        System.out.println("Security Camera is turned off");
    }
    @Override
    public void recordVideo(){
        System.out.println("Security Camera is recording video");
    }
}
class SmartPhone implements Switchable, Chargable {
    @Override
    public void turnOn() {
        System.out.println("Smartphone is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Smartphone is turned off");
    }

    @Override
    public void charge() {
        System.out.println("Smartphone is charging");
    }
}
class InterfaceSegregation {
    public static void main(String[] args) {
        Light light = new Light();
        light.turnOn();
        light.changeColor("Blue");
        light.turnOff();

        Fan fan = new Fan();
        fan.turnOn();
        fan.setTemperature(22);
        fan.turnOff();

        SecurityCamera camera = new SecurityCamera();
        camera.turnOn();
        camera.recordVideo();
        camera.turnOff();

        SmartPhone phone = new SmartPhone();
        phone.turnOn();
        phone.charge();
        phone.turnOff();
        

    }
}