public class ActionListenerTester {

    public static void main(String[] args) {
        MyWidget widget = new MyWidget();
        FooActionListener fooListener = new FooActionListener();
        BarActionListener barListener = new BarActionListener();
        widget.addActionListener(fooListener);
        widget.addActionListener(barListener);
        widget.notifyListeners();
    }
}
	
