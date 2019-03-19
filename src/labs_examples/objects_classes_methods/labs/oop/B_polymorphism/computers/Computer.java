package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.computers;

public class Computer {

    HardDrive hardDrive;
    Ram ram;
    Monitor monitor;
    Keyboard keyboard;

    public Computer() {}

    public Computer(HardDrive hardDrive, Ram ram, Monitor monitor, Keyboard keyboard) {
        this.hardDrive = hardDrive;
        this.ram = ram;
        this.monitor = monitor;
        this.keyboard = keyboard;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
