import com.bumptech.glide.load.g;
import com.bumptech.glide.load.j;
import java.util.Collections;
import java.util.List;

public abstract interface ch<Model, Data>
{
  public abstract ch.a<Data> a(Model paramModel, int paramInt1, int paramInt2, j paramj);
  
  public abstract boolean a(Model paramModel);
  
  public static class a<Data>
  {
    public final g a;
    public final List<g> b;
    public final Ze<Data> c;
    
    public a(g paramg, Ze<Data> paramZe)
    {
      this(paramg, Collections.emptyList(), paramZe);
    }
    
    public a(g paramg, List<g> paramList, Ze<Data> paramZe)
    {
      Nj.a(paramg);
      this.a = ((g)paramg);
      Nj.a(paramList);
      this.b = ((List)paramList);
      Nj.a(paramZe);
      this.c = ((Ze)paramZe);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ch.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */