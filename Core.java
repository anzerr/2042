
public class Core {
	public static Route route = new Route();
	
	public static void main(String args[]) {
		CliParser parser = new CliParser(args);
		route.run(parser.action(), parser.argument());
		(new Logs()).close();
	}
}
