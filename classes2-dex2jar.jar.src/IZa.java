import io.faceapp.ui.image_editor.common.view.ResultingBitmapView.d.a;
import io.faceapp.ui.image_editor.common.view.ResultingBitmapView.d.c;

final class iza
  extends pXa
  implements cXa<Object, cWa>
{
  iza(lza paramlza, eBa parameBa)
  {
    super(1);
  }
  
  public final void a(Object paramObject)
  {
    Object localObject;
    if ((paramObject instanceof qBa.c))
    {
      paramObject = (qBa.c)paramObject;
      localObject = ((qBa.c)paramObject).b();
      if ((localObject instanceof rCa.a.b))
      {
        localObject = (mza)this.b.c();
        if (localObject != null) {
          ((mza)localObject).a(new ResultingBitmapView.d.a(((rCa.a.b)((qBa.c)paramObject).b()).a()));
        }
      }
      else if ((localObject instanceof rCa.a.a))
      {
        localObject = (mza)this.b.c();
        if (localObject != null) {
          ((mza)localObject).a(new ResultingBitmapView.d.a(((qBa.c)paramObject).b()));
        }
      }
    }
    else if ((paramObject instanceof qBa.b))
    {
      localObject = this.b;
      paramObject = Rfa.b.a(((qBa.b)paramObject).a(), new Rfa.f[0]);
      hza localhza = new hza(this);
      gla.a((gla)localObject, (Throwable)paramObject, new Rfa.f[0], localhza, false, null, 24, null);
    }
    else if ((paramObject instanceof pBa))
    {
      localObject = (mza)this.b.c();
      if (localObject != null) {
        ((mza)localObject).a(new ResultingBitmapView.d.c(null, ((pBa)paramObject).a()));
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/iza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */