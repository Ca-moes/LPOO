import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        AreaAggregator aggregator = new AreaAggregator();

        aggregator.addShape(new Square(10));
        aggregator.addShape(new Circle(5));
        aggregator.addShape(new Circle(2));
        aggregator.addShape(new Ellipse(2, 3));
        aggregator.addShape(new Rectangle(10, 5));
        aggregator.addShape(new Triangle(10, 2));
        aggregator.addShape(new House(100));

        AreaStringOutputter stringOutputter = new AreaStringOutputter(aggregator);
        AreaXMLOutputter xmlOutputter = new AreaXMLOutputter(aggregator);

        System.out.println(stringOutputter.output());
        System.out.println(xmlOutputter.output());

        List<House> houses = new ArrayList<>();
        houses.add(new House(50));
        houses.add(new House(150));

        City city = new City(houses);

        AreaStringOutputter cityStringOutputter = new AreaStringOutputter(city);
        AreaXMLOutputter cityXmlOutputter = new AreaXMLOutputter(city);

        System.out.println(cityStringOutputter.output());
        System.out.println(cityXmlOutputter.output());
    }



    /*public static void main(String[] args) {
        AreaAggregator aggregator = new AreaAggregator();
        AreaShape AreaShape = new Square(4);
        AreaShape AreaShape1 = new Circle(4);
        AreaShape AreaShape2 = new Square(2);
        AreaShape AreaShape3 = new Triangle(3,2);
        House house = new House(100);


        List<House> houses = new ArrayList<>();
        houses.add(new House(50));
        houses.add(new House(150));

        City city = new City(houses);

        AreaStringOutputter cityStringOutputter = new AreaStringOutputter(city);
        AreaXMLOutputter cityXmlOutputter = new AreaXMLOutputter(city);


        aggregator.addShape(AreaShape);
        aggregator.addShape(AreaShape1);
        aggregator.addShape(AreaShape2);
        aggregator.addShape(AreaShape3);
        aggregator.addShape(house);

        //...
        AreaStringOutputter stringOutputter = new AreaStringOutputter(aggregator);
        AreaXMLOutputter xmlOutputter = new AreaXMLOutputter(aggregator);

        System.out.println(stringOutputter.output());
        System.out.println(xmlOutputter.output());

    }*/
}
