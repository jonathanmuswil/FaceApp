import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

final class fbb
  extends Sab.a
{
  final Executor a;
  
  fbb(Executor paramExecutor)
  {
    this.a = paramExecutor;
  }
  
  public Sab<?, ?> a(Type paramType, Annotation[] paramArrayOfAnnotation, vbb paramvbb)
  {
    if (Sab.a.a(paramType) != Rab.class) {
      return null;
    }
    return new bbb(this, xbb.b(paramType));
  }
  
  static final class a<T>
    implements Rab<T>
  {
    final Executor a;
    final Rab<T> b;
    
    a(Executor paramExecutor, Rab<T> paramRab)
    {
      this.a = paramExecutor;
      this.b = paramRab;
    }
    
    public boolean D()
    {
      return this.b.D();
    }
    
    public void a(Tab<T> paramTab)
    {
      xbb.a(paramTab, "callback == null");
      this.b.a(new ebb(this, paramTab));
    }
    
    public void cancel()
    {
      this.b.cancel();
    }
    
    public Rab<T> clone()
    {
      return new a(this.a, this.b.clone());
    }
    
    public tbb<T> execute()
      throws IOException
    {
      return this.b.execute();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/fbb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */