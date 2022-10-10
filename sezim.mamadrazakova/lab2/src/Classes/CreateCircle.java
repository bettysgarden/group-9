package Classes;
import Interfaces.Creator;
import java.util.Scanner;
public class CreateCircle implements Creator {
    @Override
    public  PlaneFigure createFigure() {
        Scanner input = new Scanner(System.in);
        //name
        System.out.println("Введите название фигуры: ");
        String name=input.nextLine();
        System.out.println("Введите периметр фигуры: ");
        double perimeter=input.nextDouble();
        System.out.println("Введите радиус фигуры: ");
        double radius=input.nextDouble();
        return new Circle(name, perimeter, radius);
    }
}
