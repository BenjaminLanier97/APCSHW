public class Driver{
public static void main(String[] args) {
if (args.length != 4 && args.length != 5) {
System.out.println("Command Input as Follows");
System.out.println("java WordGrid <rows> <cols> <filename> <filled> [seed]");
return;
}
try {
WordGrid gridInitial = new WordGrid(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
if (args.length == 5) {
gridInitial.setSeed(Integer.parseInt(args[4]));
}
}
