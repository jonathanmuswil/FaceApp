package io.faceapp.ui.components;

import GVa;
import KOa;
import QQa;
import android.content.Context;
import android.support.v4.content.c;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;
import oXa;

public final class TagCloud
  extends ViewGroup
{
  private final GVa<String> a;
  private final int b;
  private final int c;
  private final QQa<String> d;
  
  public TagCloud(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public TagCloud(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public TagCloud(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = GVa.t();
    oXa.a(paramContext, "PublishSubject.create()");
    this.a = paramContext;
    this.b = KOa.b.a(8.0F);
    this.c = KOa.b.a(8.0F);
    paramContext = this.a.i();
    oXa.a(paramContext, "tagClickedSubject.hide()");
    this.d = paramContext;
    a();
  }
  
  public final void a() {}
  
  public final QQa<String> getTagClicks()
  {
    return this.d;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = getChildCount();
    int j = getPaddingLeft();
    int k = getPaddingTop();
    int m = getMeasuredWidth();
    int n = getPaddingRight();
    int i1 = getPaddingLeft();
    paramInt3 = j;
    int i2 = 0;
    paramInt2 = 0;
    while (i2 < i)
    {
      View localView = getChildAt(i2);
      oXa.a(localView, "child");
      if (localView.getVisibility() == 8) {
        return;
      }
      localView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
      int i3 = localView.getMeasuredWidth();
      int i4 = localView.getMeasuredHeight();
      paramInt4 = paramInt3;
      int i5 = k;
      paramInt1 = paramInt2;
      if (paramInt3 + i3 + this.b >= m - n - i1)
      {
        i5 = k + (paramInt2 + this.c);
        paramInt4 = j;
        paramInt1 = 0;
      }
      paramInt2 = paramInt4;
      if (paramInt4 != j) {
        paramInt2 = paramInt4 + this.b;
      }
      paramInt3 = i3 + paramInt2;
      localView.layout(paramInt2, i5, paramInt3, i5 + i4);
      paramInt2 = paramInt1;
      if (paramInt1 < i4) {
        paramInt2 = i4;
      }
      i2++;
      k = i5;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getSize(paramInt1);
    int j = getPaddingLeft();
    int k = getPaddingTop();
    int m = getPaddingRight();
    int n = getChildCount();
    paramInt2 = j;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    while (i1 < n)
    {
      View localView = getChildAt(i1);
      oXa.a(localView, "child");
      if (localView.getVisibility() == 8) {
        return;
      }
      localView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
      int i4 = localView.getMeasuredWidth();
      i2 = localView.getMeasuredHeight();
      int i5 = k;
      int i6 = paramInt2;
      paramInt1 = i3;
      if (paramInt2 + i4 + this.b >= i - m)
      {
        i5 = k + (i3 + this.c);
        i6 = j;
        paramInt1 = 0;
      }
      paramInt2 = i6;
      if (i6 != j) {
        paramInt2 = i6 + this.b;
      }
      i3 = paramInt1;
      if (paramInt1 < i2) {
        i3 = i2;
      }
      paramInt2 += i4;
      i1++;
      k = i5;
    }
    setMeasuredDimension(i, k + i2 + getPaddingBottom());
  }
  
  public final void setTags(List<String> paramList)
  {
    oXa.b(paramList, "tags");
    removeAllViews();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      paramList = (String)localIterator.next();
      TextView localTextView = new TextView(getContext());
      localTextView.setBackgroundResource(2131230880);
      localTextView.setText(paramList);
      localTextView.setTextColor(c.a(getContext(), 2131099888));
      localTextView.setPadding(KOa.b.a(12.0F), KOa.b.a(8.0F), KOa.b.a(12.0F), KOa.b.a(8.0F));
      localTextView.setOnClickListener(new I(paramList, this));
      addView(localTextView);
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/components/TagCloud.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */