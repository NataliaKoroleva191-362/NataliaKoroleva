public class R3Vector {
    public int x, y, z;
    public R3Vector(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static R3Vector sum(R3Vector a, R3Vector b){
        R3Vector c = new R3Vector(0, 0, 0);
        c.x = a.x + b.x;
        c.y = a.y + b.y;
        c.z = a.z + b.z;
        return c;
    }

    public static R3Vector minus(R3Vector a, R3Vector b){
        R3Vector c = new R3Vector(0, 0, 0);
        c.x = a.x - b.x;
        c.y = a.y - b.y;
        c.z = a.z - b.z;
        return c;
    }

    public static R3Vector mulNum(R3Vector a, int b){
        R3Vector c = new R3Vector(0, 0, 0);
        c.x = a.x * b;
        c.y = a.y * b;
        c.z = a.z * b;
        return c;
    }

    public static int mulScal(R3Vector a, R3Vector b){
        int c = 0;
        c += a.x * b.x;
        c += a.y * b.y;
        c += a.z * b.z;
        return c;
    }

    public static R3Vector mulVec(R3Vector a, R3Vector b){
        R3Vector c = new R3Vector(0, 0, 0);
        c.x = a.y * b.z - a.z * b.y;
        c.y = a.z * b.x - a.x * b.z;
        c.z = a.x * b.y - a.y * b.z;
        return c;
    }

    public static int mulMix(R3Vector a, R3Vector b, R3Vector c){
        return mulScal(mulVec(a, b), c);
    }
}