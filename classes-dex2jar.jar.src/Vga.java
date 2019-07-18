import java.io.File;

public final class vga
  extends bia<File>
{
  private static final byte[] j = { (byte)'ÿ', (byte)'ú', (byte)' ' };
  public static final vga.a k = new vga.a(null);
  private final String l;
  private final String m;
  private final boolean n;
  private final boolean o;
  
  public vga(Eda paramEda, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramEda);
    this.m = paramString;
    this.n = paramBoolean1;
    this.o = paramBoolean2;
    paramEda = new StringBuilder();
    paramEda.append(super.c());
    paramEda.append(".Filter");
    this.l = paramEda.toString();
  }
  
  private final boolean o()
  {
    Uoa.b.a(j, 8316L);
    return true;
  }
  
  private final QQa<uia> p()
  {
    QQa localQQa = QQa.a(Bga.a);
    oXa.a(localQQa, "Observable.defer {\n     …ervable.empty()\n        }");
    return localQQa;
  }
  
  protected kRa a()
  {
    Object localObject = i().j().f().c(new yga(this));
    oXa.a(localObject, "photoOp.region().result(…rvable)\n                }");
    localObject = RPa.a((QQa)localObject, new Rfa.f[] { Rfa.f.j.e, Rfa.f.l.e }).b(EVa.b()).a(new zga(this), new Aga(this));
    oXa.a(localObject, "photoOp.region().result(…        { setError(it) })");
    return (kRa)localObject;
  }
  
  public final String j()
  {
    return this.m;
  }
  
  public static final class a {}
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/vga.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */