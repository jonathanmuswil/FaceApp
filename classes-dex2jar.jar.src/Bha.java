import java.io.File;
import java.io.InputStream;

final class bha
  extends pXa
  implements bXa<cWa>
{
  bha(cha paramcha)
  {
    super(0);
  }
  
  public final void b()
  {
    Object localObject = (InputStream)this.b.a.a;
    if (localObject != null) {
      ((InputStream)localObject).close();
    }
    localObject = (kab)this.b.b.a;
    if (localObject != null) {
      ((Dab)localObject).close();
    }
    localObject = this.b;
    if (((cha)localObject).c.a != ((cha)localObject).d) {
      ((cha)localObject).e.delete();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/bha.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */