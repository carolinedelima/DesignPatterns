import java.util.List;

public class Main {

    public static void main(String[] args) {

        ObjectPool objectPool = new ObjectPool();
        PooledObject pooledObject = objectPool.getPooledObject();
        objectPool.releasePooledObject(pooledObject);

    }
}
