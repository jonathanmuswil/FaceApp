import android.os.Bundle;
import android.support.v4.app.l;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import io.faceapp.k;
import io.faceapp.ui.components.AppBar;
import io.faceapp.ui.components.TagCloud;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class zOa
  extends ala<JOa, IOa>
  implements JOa
{
  public static final zOa.a la = new zOa.a(null);
  private final int ma = 2131493021;
  private final int na = 2131690000;
  private final int oa = 2131492907;
  private final GVa<JOa.b> pa;
  private String qa;
  private List<String> ra;
  private JOa.d sa;
  private jRa ta;
  private ViewTreeObserver.OnGlobalLayoutListener ua;
  private boolean va;
  private HashMap wa;
  
  public zOa()
  {
    GVa localGVa = GVa.t();
    oXa.a(localGVa, "PublishSubject.create()");
    this.pa = localGVa;
  }
  
  public void Lb()
  {
    HashMap localHashMap = this.wa;
    if (localHashMap != null) {
      localHashMap.clear();
    }
  }
  
  public IOa Mb()
  {
    String str = this.qa;
    if (str != null)
    {
      List localList = this.ra;
      if (localList != null)
      {
        JOa.d locald = this.sa;
        if (locald != null) {
          return new IOa(str, localList, locald);
        }
        oXa.b("resultListener");
        throw null;
      }
      oXa.b("suggestedComments");
      throw null;
    }
    oXa.b("initComment");
    throw null;
  }
  
  public Integer Wb()
  {
    return Integer.valueOf(this.oa);
  }
  
  public int Xb()
  {
    return this.na;
  }
  
  public int Zb()
  {
    return this.ma;
  }
  
  public void a(JOa.c paramc)
  {
    oXa.b(paramc, "model");
    paramc = (JOa.c.a)paramc;
    ((TagCloud)f(k.suggestionsContentView)).setTags(paramc.a());
  }
  
  public void a(View paramView, Bundle paramBundle)
  {
    oXa.b(paramView, "view");
    Object localObject = (ImageView)f(k.clearCommentView);
    oXa.a(localObject, "clearCommentView");
    ((View)localObject).setOnClickListener(new BOa(this));
    localObject = (AppBar)f(k.appBar);
    oXa.a(localObject, "appBar");
    localObject = (TextView)((AppBar)localObject).c(k.doneButtonView);
    oXa.a(localObject, "appBar.doneButtonView");
    ((View)localObject).setOnClickListener(new DOa(this, paramView));
    this.ta = new jRa();
    localObject = this.ta;
    if (localObject != null)
    {
      ((jRa)localObject).b(((TagCloud)f(k.suggestionsContentView)).getTagClicks().c(new EOa(this)));
      localObject = this.ta;
      if (localObject != null)
      {
        ((jRa)localObject).b(gW.a((EditText)f(k.commentEditView)).t().c(new FOa(this)));
        this.ua = new GOa(this, paramView);
        localObject = paramView.getViewTreeObserver();
        ViewTreeObserver.OnGlobalLayoutListener localOnGlobalLayoutListener = this.ua;
        if (localOnGlobalLayoutListener != null)
        {
          ((ViewTreeObserver)localObject).addOnGlobalLayoutListener(localOnGlobalLayoutListener);
          super.a(paramView, paramBundle);
          return;
        }
        oXa.b("keyboardListener");
        throw null;
      }
      oXa.b("disposable");
      throw null;
    }
    oXa.b("disposable");
    throw null;
  }
  
  public void a(String paramString, int paramInt, boolean paramBoolean)
  {
    oXa.b(paramString, "text");
    ((EditText)f(k.commentEditView)).setText(paramString);
    if (paramBoolean) {
      ((EditText)f(k.commentEditView)).setSelection(0, paramString.length());
    } else {
      ((EditText)f(k.commentEditView)).setSelection(paramInt);
    }
    paramString = (EditText)f(k.commentEditView);
    oXa.a(paramString, "commentEditView");
    paramString.setPressed(true);
  }
  
  protected void bc()
  {
    if (this.va)
    {
      View localView = eb();
      if (localView != null) {
        UPa.b(localView);
      }
      a(eb(), 500L, new AOa(this));
    }
    else
    {
      super.bc();
    }
  }
  
  public void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    paramBundle = Ja();
    if (paramBundle != null)
    {
      oXa.a(paramBundle, "it");
      this.qa = EPa.c(paramBundle, "init_comment");
      ArrayList localArrayList = paramBundle.getStringArrayList("suggested_comments");
      oXa.a(localArrayList, "it.getStringArrayList(SUGGESTED_COMMENTS)");
      this.ra = localArrayList;
      if (paramBundle != null)
      {
        oXa.a(paramBundle, "arguments?.also {\n      … necessary params\")\n    }");
        try
        {
          paramBundle = cb();
          if (paramBundle != null)
          {
            paramBundle = (JOa.d)paramBundle;
            this.sa = paramBundle;
            return;
          }
          paramBundle = new _Va;
          paramBundle.<init>("null cannot be cast to non-null type io.faceapp.ui.voting.comment.VotingCommentView.VotingCommentResultListener");
          throw paramBundle;
        }
        catch (ClassCastException paramBundle)
        {
          throw new IllegalStateException("No result listener defined for VotingComment screen");
        }
      }
    }
    throw new IllegalArgumentException("Fragment created without necessary params");
  }
  
  public View f(int paramInt)
  {
    if (this.wa == null) {
      this.wa = new HashMap();
    }
    View localView1 = (View)this.wa.get(Integer.valueOf(paramInt));
    View localView2 = localView1;
    if (localView1 == null)
    {
      localView2 = eb();
      if (localView2 == null) {
        return null;
      }
      localView2 = localView2.findViewById(paramInt);
      this.wa.put(Integer.valueOf(paramInt), localView2);
    }
    return localView2;
  }
  
  public GVa<JOa.b> getViewActions()
  {
    return this.pa;
  }
  
  public void sb()
  {
    Object localObject = this.ta;
    if (localObject != null)
    {
      ((jRa)localObject).i();
      localObject = eb();
      if (localObject != null)
      {
        ViewTreeObserver localViewTreeObserver = ((View)localObject).getViewTreeObserver();
        if (localViewTreeObserver != null)
        {
          localObject = this.ua;
          if (localObject != null)
          {
            localViewTreeObserver.removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)localObject);
          }
          else
          {
            oXa.b("keyboardListener");
            throw null;
          }
        }
      }
      super.sb();
      Lb();
      return;
    }
    oXa.b("disposable");
    throw null;
  }
  
  public static final class a
  {
    public final zOa a(String paramString, ArrayList<String> paramArrayList)
    {
      oXa.b(paramString, "initComment");
      oXa.b(paramArrayList, "suggestedComments");
      zOa localzOa = new zOa();
      Bundle localBundle = new Bundle();
      localBundle.putString("init_comment", paramString);
      localBundle.putStringArrayList("suggested_comments", paramArrayList);
      localzOa.m(localBundle);
      return localzOa;
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/zOa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */