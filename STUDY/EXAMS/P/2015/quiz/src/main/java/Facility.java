import java.util.ArrayList;
import java.util.List;

public abstract class Facility {

    public abstract String getName();

    @Override
    public abstract String toString();

    public abstract boolean canEnter(User user);
}
