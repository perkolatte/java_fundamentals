package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.computers;

public class ComputerController {

    public static void main(String[] args) {

        GSkillRam gSkillRam = new GSkillRam();
        SamsungHardDrive samsungHardDrive = new SamsungHardDrive();
        SonyMonitor sonyMonitor = new SonyMonitor();
        SonyKeyboard sonyKeyboard = new SonyKeyboard();

        Computer computer = new Computer(samsungHardDrive, gSkillRam, sonyMonitor, sonyKeyboard);


        gSkillRam.storeThing(5);
        gSkillRam.retrieveThing();


    }

}
