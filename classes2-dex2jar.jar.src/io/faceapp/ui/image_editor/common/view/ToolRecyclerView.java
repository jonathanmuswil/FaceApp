package io.faceapp.ui.image_editor.common.view;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.f;
import android.support.v7.widget.eb;
import android.util.AttributeSet;
import android.view.ViewGroup;
import io.faceapp.ui.misc.CenterLayoutManager;
import oXa;

public final class ToolRecyclerView
  extends RecyclerView
{
  public ToolRecyclerView(Context paramContext)
  {
    this(paramContext, null, 0, 6, null);
  }
  
  public ToolRecyclerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0, 4, null);
  }
  
  public ToolRecyclerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final ToolRecyclerView a(RecyclerView.a<?> parama)
  {
    oXa.b(parama, "adapter");
    setAdapter(parama);
    return this;
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    setHasFixedSize(false);
    setOverScrollMode(2);
    int i = (int)getResources().getDimension(2131165432);
    Object localObject = getContext();
    oXa.a(localObject, "context");
    setLayoutManager(new CenterLayoutManager((Context)localObject, 0, false, false, i));
    RecyclerView.f localf = getItemAnimator();
    localObject = localf;
    if (!(localf instanceof eb)) {
      localObject = null;
    }
    localObject = (eb)localObject;
    if (localObject != null) {
      ((eb)localObject).a(false);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/image_editor/common/view/ToolRecyclerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */