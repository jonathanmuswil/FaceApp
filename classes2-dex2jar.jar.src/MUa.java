import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.l;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import io.faceapp.k;
import io.faceapp.ui.components.CameraPreview;
import io.faceapp.ui.components.FaceOverlayAsFace;
import io.faceapp.ui.components.q;
import io.faceapp.ui.components.q.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class mua
  extends ala<Eua, Dua>
  implements Eua
{
  public static final mua.a la = new mua.a(null);
  private final int ma = 2131492975;
  private final GVa<Eua.b> na;
  private List<View> oa;
  private q.a pa;
  private HashMap qa;
  
  public mua()
  {
    GVa localGVa = GVa.t();
    oXa.a(localGVa, "PublishSubject.create()");
    this.na = localGVa;
  }
  
  private final void a(Eua.c.a parama)
  {
    Object localObject = (TextView)f(k.permissionLabelView);
    oXa.a(localObject, "permissionLabelView");
    UPa.b((View)localObject, 0L, 1, null);
    localObject = (TextView)f(k.permissionBtnView);
    oXa.a(localObject, "permissionBtnView");
    UPa.b((View)localObject, 0L, 1, null);
    localObject = (CameraPreview)f(k.cameraPreviewView);
    oXa.a(localObject, "cameraPreviewView");
    UPa.c((View)localObject, 0L, 1, null);
    localObject = (FaceOverlayAsFace)f(k.faceOverlayView);
    oXa.a(localObject, "faceOverlayView");
    UPa.c((View)localObject, 0L, 1, null);
    localObject = (ImageView)f(k.flashBtnView);
    oXa.a(localObject, "flashBtnView");
    UPa.a((View)localObject, parama.a());
    if (parama.a())
    {
      int i;
      if (parama.b()) {
        i = 2131231002;
      } else {
        i = 2131231001;
      }
      ((ImageView)f(k.flashBtnView)).setImageResource(i);
    }
    dc();
    parama = (ImageView)f(k.flashBtnView);
    oXa.a(parama, "flashBtnView");
    parama.setClickable(true);
    parama = (ImageView)f(k.switchCameraBtnView);
    oXa.a(parama, "switchCameraBtnView");
    parama.setClickable(true);
    parama = (ImageView)f(k.shutterBtnView);
    oXa.a(parama, "shutterBtnView");
    parama.setClickable(true);
  }
  
  private final void cc()
  {
    Object localObject = (TextView)f(k.permissionLabelView);
    oXa.a(localObject, "permissionLabelView");
    UPa.c((View)localObject, 0L, 1, null);
    localObject = (TextView)f(k.permissionBtnView);
    oXa.a(localObject, "permissionBtnView");
    UPa.c((View)localObject, 0L, 1, null);
    localObject = (CameraPreview)f(k.cameraPreviewView);
    oXa.a(localObject, "cameraPreviewView");
    UPa.b((View)localObject, 0L, 1, null);
    localObject = (FaceOverlayAsFace)f(k.faceOverlayView);
    oXa.a(localObject, "faceOverlayView");
    UPa.b((View)localObject, 0L, 1, null);
    localObject = (ImageView)f(k.flashBtnView);
    oXa.a(localObject, "flashBtnView");
    UPa.c((View)localObject, 0L, 1, null);
    dc();
    localObject = (TextView)f(k.permissionBtnView);
    oXa.a(localObject, "permissionBtnView");
    ((TextView)localObject).setClickable(true);
  }
  
  private final void dc()
  {
    Object localObject = this.oa;
    if (localObject != null)
    {
      localObject = ((Iterable)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        ((View)((Iterator)localObject).next()).setClickable(false);
      }
      return;
    }
    oXa.b("clickableViews");
    throw null;
  }
  
  public void Lb()
  {
    HashMap localHashMap = this.qa;
    if (localHashMap != null) {
      localHashMap.clear();
    }
  }
  
  public Dua Mb()
  {
    Context localContext = Jb();
    oXa.a(localContext, "requireContext()");
    q.a locala = this.pa;
    if (locala != null) {
      return new Dua(localContext, locala);
    }
    oXa.b("resultListener");
    throw null;
  }
  
  public void S()
  {
    View localView = eb();
    if (localView != null)
    {
      oXa.a(localView, "it");
      localView.post(new rua(localView.getContext()));
    }
  }
  
  public void Z()
  {
    View localView = eb();
    if (localView != null)
    {
      oXa.a(localView, "it");
      localView.post(new sua(localView.getContext()));
    }
  }
  
  public int Zb()
  {
    return this.ma;
  }
  
  public void a(Aja paramAja)
  {
    oXa.b(paramAja, "manager");
    ((CameraPreview)f(k.cameraPreviewView)).setCameraManager(paramAja);
  }
  
  public void a(Eua.c paramc)
  {
    oXa.b(paramc, "model");
    if (oXa.a(paramc, Eua.c.b.a))
    {
      cc();
    }
    else
    {
      if (!(paramc instanceof Eua.c.a)) {
        break label39;
      }
      a((Eua.c.a)paramc);
    }
    return;
    label39:
    throw new UVa();
  }
  
  public void a(View paramView, Bundle paramBundle)
  {
    oXa.b(paramView, "view");
    Object localObject = (ImageView)f(k.shutterBtnView);
    oXa.a(localObject, "shutterBtnView");
    ImageView localImageView1 = (ImageView)f(k.flashBtnView);
    oXa.a(localImageView1, "flashBtnView");
    ImageView localImageView2 = (ImageView)f(k.switchCameraBtnView);
    oXa.a(localImageView2, "switchCameraBtnView");
    TextView localTextView = (TextView)f(k.permissionBtnView);
    oXa.a(localTextView, "permissionBtnView");
    this.oa = mWa.c(new View[] { localObject, localImageView1, localImageView2, localTextView });
    localObject = (ImageView)f(k.flashBtnView);
    oXa.a(localObject, "flashBtnView");
    ((View)localObject).setOnClickListener(new nua(this));
    localObject = (ImageView)f(k.switchCameraBtnView);
    oXa.a(localObject, "switchCameraBtnView");
    ((View)localObject).setOnClickListener(new oua(this));
    localObject = (ImageView)f(k.shutterBtnView);
    oXa.a(localObject, "shutterBtnView");
    ((View)localObject).setOnClickListener(new pua(this));
    localObject = (TextView)f(k.permissionBtnView);
    oXa.a(localObject, "permissionBtnView");
    ((View)localObject).setOnClickListener(new qua(this));
    super.a(paramView, paramBundle);
  }
  
  public void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    try
    {
      paramBundle = cb();
      if (paramBundle != null)
      {
        paramBundle = new q.a((q)paramBundle, db());
        this.pa = paramBundle;
        return;
      }
      paramBundle = new _Va;
      paramBundle.<init>("null cannot be cast to non-null type io.faceapp.ui.components.ImageSelectListener");
      throw paramBundle;
    }
    catch (ClassCastException paramBundle)
    {
      throw new IllegalStateException("No result listener defined for Camera screen");
    }
  }
  
  public View f(int paramInt)
  {
    if (this.qa == null) {
      this.qa = new HashMap();
    }
    View localView1 = (View)this.qa.get(Integer.valueOf(paramInt));
    View localView2 = localView1;
    if (localView1 == null)
    {
      localView2 = eb();
      if (localView2 == null) {
        return null;
      }
      localView2 = localView2.findViewById(paramInt);
      this.qa.put(Integer.valueOf(paramInt), localView2);
    }
    return localView2;
  }
  
  public void g(boolean paramBoolean)
  {
    FaceOverlayAsFace localFaceOverlayAsFace = (FaceOverlayAsFace)f(k.faceOverlayView);
    if (paramBoolean) {
      UPa.b(localFaceOverlayAsFace, 0L, 1, null);
    } else {
      UPa.c(localFaceOverlayAsFace, 0L, 1, null);
    }
  }
  
  public GVa<Eua.b> getViewActions()
  {
    return this.na;
  }
  
  public void sb()
  {
    List localList = this.oa;
    if (localList != null)
    {
      localList.clear();
      super.sb();
      Lb();
      return;
    }
    oXa.b("clickableViews");
    throw null;
  }
  
  public void wb()
  {
    super.wb();
    FPa.a(this, 2131099682, true);
  }
  
  public void xb()
  {
    FPa.b(this);
    super.xb();
  }
  
  public static final class a
  {
    public final mua a()
    {
      return new mua();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/mua.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */