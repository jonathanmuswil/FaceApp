import io.faceapp.k;
import io.faceapp.ui.image_editor.common.view.ValueRangeView;
import io.faceapp.ui.image_editor.common.view.g;

final class fDa<T>
  implements ARa<Boolean>
{
  fDa(eDa parameDa) {}
  
  public final void a(Boolean paramBoolean)
  {
    ValueRangeView localValueRangeView = (ValueRangeView)this.a.f(k.intensityView);
    oXa.a(localValueRangeView, "intensityView");
    g.a(localValueRangeView, paramBoolean.booleanValue() ^ true);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/fDa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */