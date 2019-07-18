package com.zhihu.matisse.ui;

import AY;
import DY;
import DY.a;
import FY;
import GY;
import GY.a;
import IY.d;
import IY.e;
import JY;
import LY;
import Vd;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.G;
import android.support.v4.app.o;
import android.support.v4.app.s;
import android.support.v7.app.m;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.CursorAdapter;
import android.widget.TextView;
import com.zhihu.matisse.internal.ui.widget.c;
import hY;
import java.util.ArrayList;
import kY;
import lY;
import mY;
import uY;
import vY;
import yY;

public class MatisseActivity
  extends m
  implements DY.a, AdapterView.OnItemSelectedListener, GY.a, IY.d, IY.e
{
  private final DY q = new DY();
  private LY r;
  private FY s = new FY(this);
  private AY t;
  private c u;
  private JY v;
  private View w;
  private View x;
  
  private void a(uY paramuY)
  {
    if ((paramuY.p()) && (paramuY.q()))
    {
      this.w.setVisibility(8);
      this.x.setVisibility(0);
    }
    else
    {
      this.w.setVisibility(0);
      this.x.setVisibility(8);
      paramuY = GY.a(paramuY);
      G localG = e().a();
      localG.b(lY.container, paramuY, GY.class.getSimpleName());
      localG.b();
    }
  }
  
  private void n()
  {
    Intent localIntent = new Intent();
    localIntent.putParcelableArrayListExtra("extra_result_selection", (ArrayList)this.s.b());
    localIntent.putStringArrayListExtra("extra_result_selection_path", (ArrayList)this.s.a());
    setResult(-1, localIntent);
    finish();
    overridePendingTransition(hY.stable, hY.slide_out_down);
  }
  
  public void a()
  {
    this.v.swapCursor(null);
  }
  
  public void a(Cursor paramCursor)
  {
    this.v.swapCursor(paramCursor);
    new Handler(Looper.getMainLooper()).post(new b(this, paramCursor));
  }
  
  public void a(uY paramuY, yY paramyY, int paramInt)
  {
    n();
  }
  
  public FY c()
  {
    return this.s;
  }
  
  public void d()
  {
    LY localLY = this.r;
    if (localLY != null) {
      localLY.a(this, 24);
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 != -1) {
      return;
    }
    if (paramInt1 == 24)
    {
      Uri localUri = this.r.b();
      Object localObject = this.r.a();
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(localUri);
      paramIntent = new ArrayList();
      paramIntent.add(localObject);
      localObject = new Intent();
      ((Intent)localObject).putParcelableArrayListExtra("extra_result_selection", localArrayList);
      ((Intent)localObject).putStringArrayListExtra("extra_result_selection_path", paramIntent);
      setResult(-1, (Intent)localObject);
      if (Build.VERSION.SDK_INT < 21) {
        revokeUriPermission(localUri, 3);
      }
      finish();
    }
  }
  
  public void onBackPressed()
  {
    setResult(0);
    super.onBackPressed();
    if (isFinishing()) {
      overridePendingTransition(hY.stable, hY.slide_out_down);
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    this.t = AY.b();
    setTheme(this.t.d);
    super.onCreate(paramBundle);
    setContentView(mY.activity_matisse);
    if (this.t.c()) {
      setRequestedOrientation(this.t.e);
    }
    if (this.t.k)
    {
      this.r = new LY(this);
      localObject = this.t.l;
      if (localObject != null) {
        this.r.a((vY)localObject);
      } else {
        throw new RuntimeException("Don't forget to set CaptureStrategy.");
      }
    }
    Object localObject = (Toolbar)findViewById(lY.toolbar);
    Drawable localDrawable = Vd.b(this, kY.ic_back_toolbar);
    if (localDrawable != null)
    {
      localDrawable.setAutoMirrored(true);
      ((Toolbar)localObject).setNavigationIcon(localDrawable);
      ((Toolbar)localObject).setNavigationOnClickListener(new a(this));
    }
    this.w = findViewById(lY.container);
    this.x = findViewById(lY.empty_view);
    this.s.a(paramBundle);
    this.v = new JY(this, null, false);
    this.u = new c(this);
    this.u.a(this);
    this.u.a((TextView)findViewById(lY.selected_album));
    this.u.a(findViewById(lY.toolbar));
    this.u.a(this.v);
    this.q.a(this, this);
    this.q.a(paramBundle);
    this.q.b();
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    this.q.c();
  }
  
  public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.q.a(paramInt);
    this.v.getCursor().moveToPosition(paramInt);
    paramAdapterView = uY.a(this.v.getCursor());
    if ((paramAdapterView.p()) && (AY.b().k)) {
      paramAdapterView.l();
    }
    a(paramAdapterView);
  }
  
  public void onNothingSelected(AdapterView<?> paramAdapterView) {}
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 16908332)
    {
      onBackPressed();
      return true;
    }
    return super.onOptionsItemSelected(paramMenuItem);
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    this.s.b(paramBundle);
    this.q.b(paramBundle);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/com/zhihu/matisse/ui/MatisseActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */