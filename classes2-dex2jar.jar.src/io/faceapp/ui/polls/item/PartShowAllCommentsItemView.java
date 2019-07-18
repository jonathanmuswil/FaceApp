package io.faceapp.ui.polls.item;

import LIa.h;
import _Va;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import cWa;
import cXa;
import io.faceapp.k;
import java.util.HashMap;
import jta;
import oXa;

public final class PartShowAllCommentsItemView
  extends FrameLayout
  implements jta<LIa.h>
{
  public static final a a = new a(null);
  private cXa<? super LIa.h, cWa> b;
  private HashMap c;
  
  public PartShowAllCommentsItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public void a(LIa.h paramh)
  {
    oXa.b(paramh, "model");
    TextView localTextView = (TextView)b(k.showAllComments);
    oXa.a(localTextView, "showAllComments");
    localTextView.setOnClickListener(new f(this, paramh));
  }
  
  public View b(int paramInt)
  {
    if (this.c == null) {
      this.c = new HashMap();
    }
    View localView1 = (View)this.c.get(Integer.valueOf(paramInt));
    View localView2 = localView1;
    if (localView1 == null)
    {
      localView2 = findViewById(paramInt);
      this.c.put(Integer.valueOf(paramInt), localView2);
    }
    return localView2;
  }
  
  public static final class a
  {
    public final PartShowAllCommentsItemView a(ViewGroup paramViewGroup, cXa<? super LIa.h, cWa> paramcXa)
    {
      oXa.b(paramViewGroup, "parent");
      oXa.b(paramcXa, "onClick");
      paramViewGroup = LayoutInflater.from(paramViewGroup.getContext()).inflate(2131493051, paramViewGroup, false);
      if (paramViewGroup != null)
      {
        paramViewGroup = (PartShowAllCommentsItemView)paramViewGroup;
        PartShowAllCommentsItemView.a(paramViewGroup, paramcXa);
        return paramViewGroup;
      }
      throw new _Va("null cannot be cast to non-null type io.faceapp.ui.polls.item.PartShowAllCommentsItemView");
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/polls/item/PartShowAllCommentsItemView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */