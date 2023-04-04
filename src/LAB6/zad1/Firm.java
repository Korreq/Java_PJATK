package LAB6.zad1;

public class Firm {
    private Worker[] workers = {
            new Worker("Shawn", "Robles", 2000),
            new Worker("Brandon", "Hughes", 2100),
            new Worker("Rachel", "Weyand", 2000),
            new Worker("George", "Yingling", 2500),
            new Worker("Barbara", "Hooper", 4200)
    } ;
    double calculateMonthlyCost(){
        double cost = 0;
        for (Worker worker: workers) {
            cost += worker.getSalary();
        }
        return cost;
    }
    double calculateYearlyCost(){
        double cost = 0;
        for (Worker worker: workers) {
            cost += worker.getSalary();
        }
        return cost * 365 / 30;
    }
    double calculateFirmCost(String duration, int multitude){
        int time = Time.getTime(duration);
        double cost = 0;
        for (Worker worker: workers) {
            cost += worker.getSalary();
        }
        return cost / 30 * time * multitude;
    }
}
