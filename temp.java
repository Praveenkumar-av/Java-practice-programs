interface Vehicle
{
    void start();
    void stop();
    void accelerate();
}

class Car implements Vehicle
{
    public void start()
    {
        System.out.println("Car started");
    }

    public void stop()
    {
        System.out.println("Car stopped");
    }

    public void accelerate()
    {
        System.out.println("Car is moving");
    }
}

class Motorcycle implements Vehicle 
{
    public void start()
    {
        System.out.println("Bike started");
    }

    public void stop()
    {
        System.out.println("Bike stopped");
    }

    public void accelerate()
    {
        System.out.println("Bike is moving");
    }
}

class Bicycle implements Vehicle  
{
    public void start()
    {
        System.out.println("Cycle started");
    }

    public void stop()
    {
        System.out.println("Cycle stopped");
    }

    public void accelerate()
    {
        System.out.println("Cycle is moving");
    }
}

class temp
{
    public static void main(String args[])
    {
        Vehicle c = new Car();
        c.start();
        c.stop();
        c.accelerate();

        Vehicle m = new Motorcycle();
        m.start();
        m.stop();
        m.accelerate();

        Vehicle b = new Bicycle();
        b.start();
        b.stop();
        b.accelerate();
    }
}