package gb9.lambda;

public class CheckIsJump implements Check{
    @Override
    public boolean test(Animal animal) {
        return animal.isCanJump();
    }
}
