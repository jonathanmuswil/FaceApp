package io.faceapp.ui.photo_picker.item;

import Bj;
import GPa;
import Ie;
import KIa.d;
import UPa;
import VQa;
import android.content.Context;
import android.net.Uri;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import cWa;
import io.faceapp.k;
import io.faceapp.services.glide.a;
import io.faceapp.services.glide.c;
import java.util.HashMap;
import jta;
import oXa;

public final class PhotosCollectionItemView
  extends ConstraintLayout
  implements jta<d>
{
  public VQa<KIa.d> u;
  private HashMap v;
  
  public PhotosCollectionItemView(Context paramContext)
  {
    super(paramContext);
    setupView(paramContext);
  }
  
  public PhotosCollectionItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setupView(paramContext);
  }
  
  public PhotosCollectionItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setupView(paramContext);
  }
  
  private final void setupView(Context paramContext)
  {
    ViewGroup.inflate(paramContext, 2131493040, this);
    if (isInEditMode()) {
      a(d.a.a(d.a, null, 1, null));
    }
  }
  
  public void a(d paramd)
  {
    oXa.b(paramd, "model");
    ((TextView)c(k.labelView)).setText(paramd.f());
    Object localObject1 = (ImageView)c(k.smallIconView);
    Object localObject2 = paramd.e();
    int i;
    if (localObject2 != null) {
      i = ((Integer)localObject2).intValue();
    } else {
      i = 0;
    }
    ((ImageView)localObject1).setImageResource(i);
    localObject1 = paramd.b();
    if (localObject1 != null)
    {
      localObject2 = (ImageView)c(k.placeholderIconView);
      oXa.a(localObject2, "placeholderIconView");
      UPa.c((View)localObject2);
      localObject1 = a.a(getContext()).a((Uri)localObject1);
      localObject2 = paramd.a();
      if (localObject2 != null) {
        ((c)localObject1).a(new Bj(localObject2));
      }
      localObject2 = ((c)localObject1).a(paramd.c());
      oXa.a(localObject2, "GlideApp.with(context)\n …r(model.placeholderBgRes)");
      if (GPa.a((c)localObject2, 0, 1, null).a((ImageView)c(k.imageView)) != null) {}
    }
    else
    {
      localObject2 = (ImageView)c(k.placeholderIconView);
      oXa.a(localObject2, "placeholderIconView");
      UPa.e((View)localObject2);
      ((ImageView)c(k.placeholderIconView)).setImageResource(paramd.d());
      ((ImageView)c(k.imageView)).setImageResource(paramd.c());
      localObject2 = cWa.a;
    }
    localObject2 = (ImageView)c(k.imageView);
    oXa.a(localObject2, "imageView");
    ((View)localObject2).setOnClickListener(new f(this, paramd));
  }
  
  public View c(int paramInt)
  {
    if (this.v == null) {
      this.v = new HashMap();
    }
    View localView1 = (View)this.v.get(Integer.valueOf(paramInt));
    View localView2 = localView1;
    if (localView1 == null)
    {
      localView2 = findViewById(paramInt);
      this.v.put(Integer.valueOf(paramInt), localView2);
    }
    return localView2;
  }
  
  public final VQa<KIa.d> getViewActions()
  {
    VQa localVQa = this.u;
    if (localVQa != null) {
      return localVQa;
    }
    oXa.b("viewActions");
    throw null;
  }
  
  public final void setViewActions(VQa<KIa.d> paramVQa)
  {
    oXa.b(paramVQa, "<set-?>");
    this.u = paramVQa;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/photo_picker/item/PhotosCollectionItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */