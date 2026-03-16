public class Direction {

    private final int _hours;
	
	// master 1
	public Direction clockwise() {
        return new Direction(this._hours + 3);
    }

    private Direction(int hours) {
		
        hours = hours % 12;
        if (hours < 0) { hours += 12; }
		
        _hours = hours;
    }

	// branch 1
    public Direction anticlockwise() {
        return new Direction(this._hours - 3);
    }
	
	public static Direction north() {
        return new Direction(0);
    }

	// master 2
    public Direction opposite() {
        return new Direction(this._hours + 6);
    }
	
    public static Direction south() {
        return new Direction(6);
    }

	// branch 2
    public boolean isOpposite(Direction other) {
        return this.opposite().equals(other);
    }
	
    public static Direction east() {
        return new Direction(3);
    }

    public static Direction west() {
        return new Direction(9);
    }
}