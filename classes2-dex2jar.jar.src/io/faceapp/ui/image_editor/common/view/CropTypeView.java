package io.faceapp.ui.image_editor.common.view;

import _Va;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import cWa;
import cXa;
import java.util.Iterator;
import java.util.List;
import oXa;
import oxa;
import oxa.a;
import oya;

public final class CropTypeView
  extends LinearLayout
{
  private cXa<? super oxa, cWa> a = d.b;
  
  public CropTypeView(Context paramContext)
  {
    this(paramContext, null, 0, 6, null);
  }
  
  public CropTypeView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0, 4, null);
  }
  
  public CropTypeView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private final String a(oxa.a parama)
  {
    Resources localResources = getResources();
    int i;
    if (parama.d() > parama.c()) {
      i = 2131689685;
    } else if (parama.c() > parama.d()) {
      i = 2131689684;
    } else {
      i = 2131689686;
    }
    parama = localResources.getString(i);
    oXa.a(parama, "resources.getString(when…ls_Crop_Square\n        })");
    return parama;
  }
  
  public final CropTypeView a(cXa<? super oxa, cWa> paramcXa)
  {
    oXa.b(paramcXa, "applyFunc");
    this.a = paramcXa;
    return this;
  }
  
  @SuppressLint({"SetTextI18n"})
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    Iterator localIterator = oya.a().iterator();
    while (localIterator.hasNext())
    {
      oxa.a locala = (oxa.a)localIterator.next();
      Object localObject = LayoutInflater.from(getContext()).inflate(2131493024, this, false);
      if (localObject != null)
      {
        localObject = (TextView)localObject;
        addView((View)localObject);
        ((TextView)localObject).setTag(locala);
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(locala.e());
        localStringBuilder.append(" - ");
        localStringBuilder.append(a(locala));
        ((TextView)localObject).setText(localStringBuilder.toString());
        ((TextView)localObject).setOnClickListener(new e(this));
      }
      else
      {
        throw new _Va("null cannot be cast to non-null type android.widget.TextView");
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/image_editor/common/view/CropTypeView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */