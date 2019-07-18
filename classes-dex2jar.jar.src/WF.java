import com.bumptech.glide.load.d;
import com.bumptech.glide.load.j;
import java.io.File;

class wf<DataType>
  implements pg.b
{
  private final d<DataType> a;
  private final DataType b;
  private final j c;
  
  wf(d<DataType> paramd, DataType paramDataType, j paramj)
  {
    this.a = paramd;
    this.b = paramDataType;
    this.c = paramj;
  }
  
  public boolean a(File paramFile)
  {
    return this.a.a(this.b, paramFile, this.c);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/wf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */