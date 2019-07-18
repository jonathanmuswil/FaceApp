package android.support.v7.widget;

import Gd;
import Jd;
import Ld;
import Md;
import Nd;
import Pd;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.c;
import android.support.v4.view.y;
import android.support.v4.widget.h;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView.OnEditorActionListener;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import le;

public class SearchView
  extends pa
  implements le
{
  static final a p = new a();
  private Rect A = new Rect();
  private Rect B = new Rect();
  private int[] C = new int[2];
  private int[] D = new int[2];
  private final ImageView E;
  private final Drawable F;
  private final int G;
  private final int H;
  private final Intent I;
  private final Intent J;
  private final CharSequence K;
  private c L;
  private b M;
  View.OnFocusChangeListener N;
  private d O;
  private View.OnClickListener P;
  private boolean Q;
  private boolean R;
  h S;
  private boolean T;
  private CharSequence U;
  private boolean V;
  private boolean W;
  private int aa;
  private boolean ba;
  private CharSequence ca;
  private CharSequence da;
  private boolean ea;
  private int fa;
  SearchableInfo ga;
  private Bundle ha;
  private final Runnable ia = new Ua(this);
  private Runnable ja = new Va(this);
  private final WeakHashMap<String, Drawable.ConstantState> ka = new WeakHashMap();
  private final View.OnClickListener la = new Ya(this);
  View.OnKeyListener ma = new Za(this);
  private final TextView.OnEditorActionListener na = new _a(this);
  private final AdapterView.OnItemClickListener oa = new ab(this);
  private final AdapterView.OnItemSelectedListener pa = new bb(this);
  final SearchAutoComplete q;
  private TextWatcher qa = new Ta(this);
  private final View r;
  private final View s;
  private final View t;
  final ImageView u;
  final ImageView v;
  final ImageView w;
  final ImageView x;
  private final View y;
  private f z;
  
  public SearchView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SearchView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, Gd.searchViewStyle);
  }
  
  public SearchView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramAttributeSet = pb.a(paramContext, paramAttributeSet, Pd.SearchView, paramInt, 0);
    LayoutInflater.from(paramContext).inflate(paramAttributeSet.g(Pd.SearchView_layout, Md.abc_search_view), this, true);
    this.q = ((SearchAutoComplete)findViewById(Ld.search_src_text));
    this.q.setSearchView(this);
    this.r = findViewById(Ld.search_edit_frame);
    this.s = findViewById(Ld.search_plate);
    this.t = findViewById(Ld.submit_area);
    this.u = ((ImageView)findViewById(Ld.search_button));
    this.v = ((ImageView)findViewById(Ld.search_go_btn));
    this.w = ((ImageView)findViewById(Ld.search_close_btn));
    this.x = ((ImageView)findViewById(Ld.search_voice_btn));
    this.E = ((ImageView)findViewById(Ld.search_mag_icon));
    y.a(this.s, paramAttributeSet.b(Pd.SearchView_queryBackground));
    y.a(this.t, paramAttributeSet.b(Pd.SearchView_submitBackground));
    this.u.setImageDrawable(paramAttributeSet.b(Pd.SearchView_searchIcon));
    this.v.setImageDrawable(paramAttributeSet.b(Pd.SearchView_goIcon));
    this.w.setImageDrawable(paramAttributeSet.b(Pd.SearchView_closeIcon));
    this.x.setImageDrawable(paramAttributeSet.b(Pd.SearchView_voiceIcon));
    this.E.setImageDrawable(paramAttributeSet.b(Pd.SearchView_searchIcon));
    this.F = paramAttributeSet.b(Pd.SearchView_searchHintIcon);
    xb.a(this.u, getResources().getString(Nd.abc_searchview_description_search));
    this.G = paramAttributeSet.g(Pd.SearchView_suggestionRowLayout, Md.abc_search_dropdown_item_icons_2line);
    this.H = paramAttributeSet.g(Pd.SearchView_commitIcon, 0);
    this.u.setOnClickListener(this.la);
    this.w.setOnClickListener(this.la);
    this.v.setOnClickListener(this.la);
    this.x.setOnClickListener(this.la);
    this.q.setOnClickListener(this.la);
    this.q.addTextChangedListener(this.qa);
    this.q.setOnEditorActionListener(this.na);
    this.q.setOnItemClickListener(this.oa);
    this.q.setOnItemSelectedListener(this.pa);
    this.q.setOnKeyListener(this.ma);
    this.q.setOnFocusChangeListener(new Wa(this));
    setIconifiedByDefault(paramAttributeSet.a(Pd.SearchView_iconifiedByDefault, true));
    paramInt = paramAttributeSet.c(Pd.SearchView_android_maxWidth, -1);
    if (paramInt != -1) {
      setMaxWidth(paramInt);
    }
    this.K = paramAttributeSet.e(Pd.SearchView_defaultQueryHint);
    this.U = paramAttributeSet.e(Pd.SearchView_queryHint);
    paramInt = paramAttributeSet.d(Pd.SearchView_android_imeOptions, -1);
    if (paramInt != -1) {
      setImeOptions(paramInt);
    }
    paramInt = paramAttributeSet.d(Pd.SearchView_android_inputType, -1);
    if (paramInt != -1) {
      setInputType(paramInt);
    }
    setFocusable(paramAttributeSet.a(Pd.SearchView_android_focusable, true));
    paramAttributeSet.a();
    this.I = new Intent("android.speech.action.WEB_SEARCH");
    this.I.addFlags(268435456);
    this.I.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
    this.J = new Intent("android.speech.action.RECOGNIZE_SPEECH");
    this.J.addFlags(268435456);
    this.y = findViewById(this.q.getDropDownAnchor());
    paramContext = this.y;
    if (paramContext != null) {
      paramContext.addOnLayoutChangeListener(new Xa(this));
    }
    j(this.Q);
    ma();
  }
  
  private Intent a(Intent paramIntent, SearchableInfo paramSearchableInfo)
  {
    ComponentName localComponentName = paramSearchableInfo.getSearchActivity();
    Object localObject1 = new Intent("android.intent.action.SEARCH");
    ((Intent)localObject1).setComponent(localComponentName);
    PendingIntent localPendingIntent = PendingIntent.getActivity(getContext(), 0, (Intent)localObject1, 1073741824);
    Bundle localBundle = new Bundle();
    localObject1 = this.ha;
    if (localObject1 != null) {
      localBundle.putParcelable("app_data", (Parcelable)localObject1);
    }
    Intent localIntent = new Intent(paramIntent);
    int i = 1;
    Object localObject2 = getResources();
    if (paramSearchableInfo.getVoiceLanguageModeId() != 0) {
      paramIntent = ((Resources)localObject2).getString(paramSearchableInfo.getVoiceLanguageModeId());
    } else {
      paramIntent = "free_form";
    }
    int j = paramSearchableInfo.getVoicePromptTextId();
    Object localObject3 = null;
    if (j != 0) {
      localObject1 = ((Resources)localObject2).getString(paramSearchableInfo.getVoicePromptTextId());
    } else {
      localObject1 = null;
    }
    if (paramSearchableInfo.getVoiceLanguageId() != 0) {
      localObject2 = ((Resources)localObject2).getString(paramSearchableInfo.getVoiceLanguageId());
    } else {
      localObject2 = null;
    }
    if (paramSearchableInfo.getVoiceMaxResults() != 0) {
      i = paramSearchableInfo.getVoiceMaxResults();
    }
    localIntent.putExtra("android.speech.extra.LANGUAGE_MODEL", paramIntent);
    localIntent.putExtra("android.speech.extra.PROMPT", (String)localObject1);
    localIntent.putExtra("android.speech.extra.LANGUAGE", (String)localObject2);
    localIntent.putExtra("android.speech.extra.MAX_RESULTS", i);
    if (localComponentName == null) {
      paramIntent = (Intent)localObject3;
    } else {
      paramIntent = localComponentName.flattenToShortString();
    }
    localIntent.putExtra("calling_package", paramIntent);
    localIntent.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", localPendingIntent);
    localIntent.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", localBundle);
    return localIntent;
  }
  
  private Intent a(Cursor paramCursor, int paramInt, String paramString)
  {
    try
    {
      Object localObject1 = ib.a(paramCursor, "suggest_intent_action");
      Object localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = this.ga.getSuggestIntentAction();
      }
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = "android.intent.action.SEARCH";
      }
      Object localObject3 = ib.a(paramCursor, "suggest_intent_data");
      localObject2 = localObject3;
      if (localObject3 == null) {
        localObject2 = this.ga.getSuggestIntentData();
      }
      localObject3 = localObject2;
      if (localObject2 != null)
      {
        String str = ib.a(paramCursor, "suggest_intent_data_id");
        localObject3 = localObject2;
        if (str != null)
        {
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          ((StringBuilder)localObject3).append((String)localObject2);
          ((StringBuilder)localObject3).append("/");
          ((StringBuilder)localObject3).append(Uri.encode(str));
          localObject3 = ((StringBuilder)localObject3).toString();
        }
      }
      if (localObject3 == null) {
        localObject2 = null;
      } else {
        localObject2 = Uri.parse((String)localObject3);
      }
      localObject3 = ib.a(paramCursor, "suggest_intent_query");
      paramString = a((String)localObject1, (Uri)localObject2, ib.a(paramCursor, "suggest_intent_extra_data"), (String)localObject3, paramInt, paramString);
      return paramString;
    }
    catch (RuntimeException paramString)
    {
      try
      {
        paramInt = paramCursor.getPosition();
      }
      catch (RuntimeException paramCursor)
      {
        paramInt = -1;
      }
      paramCursor = new StringBuilder();
      paramCursor.append("Search suggestions cursor at row ");
      paramCursor.append(paramInt);
      paramCursor.append(" returned exception.");
      Log.w("SearchView", paramCursor.toString(), paramString);
    }
    return null;
  }
  
  private Intent a(String paramString1, Uri paramUri, String paramString2, String paramString3, int paramInt, String paramString4)
  {
    paramString1 = new Intent(paramString1);
    paramString1.addFlags(268435456);
    if (paramUri != null) {
      paramString1.setData(paramUri);
    }
    paramString1.putExtra("user_query", this.da);
    if (paramString3 != null) {
      paramString1.putExtra("query", paramString3);
    }
    if (paramString2 != null) {
      paramString1.putExtra("intent_extra_data_key", paramString2);
    }
    paramUri = this.ha;
    if (paramUri != null) {
      paramString1.putExtra("app_data", paramUri);
    }
    if (paramInt != 0)
    {
      paramString1.putExtra("action_key", paramInt);
      paramString1.putExtra("action_msg", paramString4);
    }
    paramString1.setComponent(this.ga.getSearchActivity());
    return paramString1;
  }
  
  private void a(Intent paramIntent)
  {
    if (paramIntent == null) {
      return;
    }
    try
    {
      getContext().startActivity(paramIntent);
    }
    catch (RuntimeException localRuntimeException)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Failed launch activity: ");
      localStringBuilder.append(paramIntent);
      Log.e("SearchView", localStringBuilder.toString(), localRuntimeException);
    }
  }
  
  private void a(View paramView, Rect paramRect)
  {
    paramView.getLocationInWindow(this.C);
    getLocationInWindow(this.D);
    int[] arrayOfInt1 = this.C;
    int i = arrayOfInt1[1];
    int[] arrayOfInt2 = this.D;
    i -= arrayOfInt2[1];
    int j = arrayOfInt1[0] - arrayOfInt2[0];
    paramRect.set(j, i, paramView.getWidth() + j, paramView.getHeight() + i);
  }
  
  static boolean a(Context paramContext)
  {
    boolean bool;
    if (paramContext.getResources().getConfiguration().orientation == 2) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private Intent b(Intent paramIntent, SearchableInfo paramSearchableInfo)
  {
    Intent localIntent = new Intent(paramIntent);
    paramIntent = paramSearchableInfo.getSearchActivity();
    if (paramIntent == null) {
      paramIntent = null;
    } else {
      paramIntent = paramIntent.flattenToShortString();
    }
    localIntent.putExtra("calling_package", paramIntent);
    return localIntent;
  }
  
  private boolean b(int paramInt1, int paramInt2, String paramString)
  {
    Cursor localCursor = this.S.h();
    if ((localCursor != null) && (localCursor.moveToPosition(paramInt1)))
    {
      a(a(localCursor, paramInt2, paramString));
      return true;
    }
    return false;
  }
  
  private CharSequence c(CharSequence paramCharSequence)
  {
    if ((this.Q) && (this.F != null))
    {
      int i = (int)(this.q.getTextSize() * 1.25D);
      this.F.setBounds(0, 0, i, i);
      SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder("   ");
      localSpannableStringBuilder.setSpan(new ImageSpan(this.F), 1, 2, 33);
      localSpannableStringBuilder.append(paramCharSequence);
      return localSpannableStringBuilder;
    }
    return paramCharSequence;
  }
  
  private void f(int paramInt)
  {
    Editable localEditable = this.q.getText();
    Object localObject = this.S.h();
    if (localObject == null) {
      return;
    }
    if (((Cursor)localObject).moveToPosition(paramInt))
    {
      localObject = this.S.convertToString((Cursor)localObject);
      if (localObject != null) {
        setQuery((CharSequence)localObject);
      } else {
        setQuery(localEditable);
      }
    }
    else
    {
      setQuery(localEditable);
    }
  }
  
  private int getPreferredHeight()
  {
    return getContext().getResources().getDimensionPixelSize(Jd.abc_search_view_preferred_height);
  }
  
  private int getPreferredWidth()
  {
    return getContext().getResources().getDimensionPixelSize(Jd.abc_search_view_preferred_width);
  }
  
  private void ha()
  {
    this.q.dismissDropDown();
  }
  
  private void i(boolean paramBoolean)
  {
    int i;
    if ((this.T) && (ja()) && (hasFocus()) && ((paramBoolean) || (!this.ba))) {
      i = 0;
    } else {
      i = 8;
    }
    this.v.setVisibility(i);
  }
  
  private boolean ia()
  {
    Object localObject = this.ga;
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (localObject != null)
    {
      bool2 = bool1;
      if (((SearchableInfo)localObject).getVoiceSearchEnabled())
      {
        localObject = null;
        if (this.ga.getVoiceSearchLaunchWebSearch()) {
          localObject = this.I;
        } else if (this.ga.getVoiceSearchLaunchRecognizer()) {
          localObject = this.J;
        }
        bool2 = bool1;
        if (localObject != null)
        {
          bool2 = bool1;
          if (getContext().getPackageManager().resolveActivity((Intent)localObject, 65536) != null) {
            bool2 = true;
          }
        }
      }
    }
    return bool2;
  }
  
  private void j(boolean paramBoolean)
  {
    this.R = paramBoolean;
    int i = 8;
    boolean bool1 = false;
    if (paramBoolean) {
      j = 0;
    } else {
      j = 8;
    }
    boolean bool2 = TextUtils.isEmpty(this.q.getText()) ^ true;
    this.u.setVisibility(j);
    i(bool2);
    View localView = this.r;
    if (paramBoolean) {
      j = 8;
    } else {
      j = 0;
    }
    localView.setVisibility(j);
    int j = i;
    if (this.E.getDrawable() != null) {
      if (this.Q) {
        j = i;
      } else {
        j = 0;
      }
    }
    this.E.setVisibility(j);
    la();
    paramBoolean = bool1;
    if (!bool2) {
      paramBoolean = true;
    }
    k(paramBoolean);
    oa();
  }
  
  private boolean ja()
  {
    boolean bool;
    if (((this.T) || (this.ba)) && (!c())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void k(boolean paramBoolean)
  {
    int i;
    if ((this.ba) && (!c()) && (paramBoolean))
    {
      i = 0;
      this.v.setVisibility(8);
    }
    else
    {
      i = 8;
    }
    this.x.setVisibility(i);
  }
  
  private void ka()
  {
    post(this.ia);
  }
  
  private void la()
  {
    boolean bool = TextUtils.isEmpty(this.q.getText());
    int i = 1;
    int j = bool ^ true;
    int k = 0;
    int m = i;
    if (j == 0) {
      if ((this.Q) && (!this.ea)) {
        m = i;
      } else {
        m = 0;
      }
    }
    Object localObject = this.w;
    if (m != 0) {
      m = k;
    } else {
      m = 8;
    }
    ((ImageView)localObject).setVisibility(m);
    Drawable localDrawable = this.w.getDrawable();
    if (localDrawable != null)
    {
      if (j != 0) {
        localObject = ViewGroup.ENABLED_STATE_SET;
      } else {
        localObject = ViewGroup.EMPTY_STATE_SET;
      }
      localDrawable.setState((int[])localObject);
    }
  }
  
  private void ma()
  {
    CharSequence localCharSequence = getQueryHint();
    SearchAutoComplete localSearchAutoComplete = this.q;
    Object localObject = localCharSequence;
    if (localCharSequence == null) {
      localObject = "";
    }
    localSearchAutoComplete.setHint(c((CharSequence)localObject));
  }
  
  private void na()
  {
    this.q.setThreshold(this.ga.getSuggestThreshold());
    this.q.setImeOptions(this.ga.getImeOptions());
    int i = this.ga.getInputType();
    int j = 1;
    int k = i;
    if ((i & 0xF) == 1)
    {
      i &= 0xFFFEFFFF;
      k = i;
      if (this.ga.getSuggestAuthority() != null) {
        k = i | 0x10000 | 0x80000;
      }
    }
    this.q.setInputType(k);
    Object localObject = this.S;
    if (localObject != null) {
      ((h)localObject).a(null);
    }
    if (this.ga.getSuggestAuthority() != null)
    {
      this.S = new ib(getContext(), this, this.ga, this.ka);
      this.q.setAdapter(this.S);
      localObject = (ib)this.S;
      k = j;
      if (this.V) {
        k = 2;
      }
      ((ib)localObject).a(k);
    }
  }
  
  private void oa()
  {
    int i;
    if ((ja()) && ((this.v.getVisibility() == 0) || (this.x.getVisibility() == 0))) {
      i = 0;
    } else {
      i = 8;
    }
    this.t.setVisibility(i);
  }
  
  private void setQuery(CharSequence paramCharSequence)
  {
    this.q.setText(paramCharSequence);
    SearchAutoComplete localSearchAutoComplete = this.q;
    int i;
    if (TextUtils.isEmpty(paramCharSequence)) {
      i = 0;
    } else {
      i = paramCharSequence.length();
    }
    localSearchAutoComplete.setSelection(i);
  }
  
  void a()
  {
    if (this.y.getWidth() > 1)
    {
      Resources localResources = getContext().getResources();
      int i = this.s.getPaddingLeft();
      Rect localRect = new Rect();
      boolean bool = Fb.a(this);
      int j;
      if (this.Q) {
        j = localResources.getDimensionPixelSize(Jd.abc_dropdownitem_icon_width) + localResources.getDimensionPixelSize(Jd.abc_dropdownitem_text_padding_left);
      } else {
        j = 0;
      }
      this.q.getDropDownBackground().getPadding(localRect);
      if (bool) {
        k = -localRect.left;
      } else {
        k = i - (localRect.left + j);
      }
      this.q.setDropDownHorizontalOffset(k);
      int m = this.y.getWidth();
      int n = localRect.left;
      int k = localRect.right;
      this.q.setDropDownWidth(m + n + k + j - i);
    }
  }
  
  void a(int paramInt, String paramString1, String paramString2)
  {
    paramString1 = a("android.intent.action.SEARCH", null, null, paramString2, paramInt, paramString1);
    getContext().startActivity(paramString1);
  }
  
  void a(CharSequence paramCharSequence)
  {
    setQuery(paramCharSequence);
  }
  
  public void a(CharSequence paramCharSequence, boolean paramBoolean)
  {
    this.q.setText(paramCharSequence);
    if (paramCharSequence != null)
    {
      SearchAutoComplete localSearchAutoComplete = this.q;
      localSearchAutoComplete.setSelection(localSearchAutoComplete.length());
      this.da = paramCharSequence;
    }
    if ((paramBoolean) && (!TextUtils.isEmpty(paramCharSequence))) {
      f();
    }
  }
  
  boolean a(int paramInt1, int paramInt2, String paramString)
  {
    paramString = this.O;
    if ((paramString != null) && (paramString.onSuggestionClick(paramInt1))) {
      return false;
    }
    b(paramInt1, 0, null);
    this.q.setImeVisibility(false);
    ha();
    return true;
  }
  
  boolean a(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    if (this.ga == null) {
      return false;
    }
    if (this.S == null) {
      return false;
    }
    if ((paramKeyEvent.getAction() == 0) && (paramKeyEvent.hasNoModifiers())) {
      if ((paramInt != 66) && (paramInt != 84) && (paramInt != 61))
      {
        if ((paramInt != 21) && (paramInt != 22))
        {
          if ((paramInt == 19) && (this.q.getListSelection() == 0)) {
            return false;
          }
        }
        else
        {
          if (paramInt == 21) {
            paramInt = 0;
          } else {
            paramInt = this.q.length();
          }
          this.q.setSelection(paramInt);
          this.q.setListSelection(0);
          this.q.clearListSelection();
          p.a(this.q, true);
          return true;
        }
      }
      else {
        return a(this.q.getListSelection(), 0, null);
      }
    }
    return false;
  }
  
  void b()
  {
    p.b(this.q);
    p.a(this.q);
  }
  
  void b(CharSequence paramCharSequence)
  {
    Editable localEditable = this.q.getText();
    this.da = localEditable;
    boolean bool1 = TextUtils.isEmpty(localEditable);
    boolean bool2 = true;
    bool1 ^= true;
    i(bool1);
    if (bool1) {
      bool2 = false;
    }
    k(bool2);
    la();
    oa();
    if ((this.L != null) && (!TextUtils.equals(paramCharSequence, this.ca))) {
      this.L.onQueryTextChange(paramCharSequence.toString());
    }
    this.ca = paramCharSequence.toString();
  }
  
  public boolean c()
  {
    return this.R;
  }
  
  public void clearFocus()
  {
    this.W = true;
    super.clearFocus();
    this.q.clearFocus();
    this.q.setImeVisibility(false);
    this.W = false;
  }
  
  void d()
  {
    if (TextUtils.isEmpty(this.q.getText()))
    {
      if (this.Q)
      {
        b localb = this.M;
        if ((localb == null) || (!localb.onClose()))
        {
          clearFocus();
          j(true);
        }
      }
    }
    else
    {
      this.q.setText("");
      this.q.requestFocus();
      this.q.setImeVisibility(true);
    }
  }
  
  void e()
  {
    j(false);
    this.q.requestFocus();
    this.q.setImeVisibility(true);
    View.OnClickListener localOnClickListener = this.P;
    if (localOnClickListener != null) {
      localOnClickListener.onClick(this);
    }
  }
  
  boolean e(int paramInt)
  {
    d locald = this.O;
    if ((locald != null) && (locald.onSuggestionSelect(paramInt))) {
      return false;
    }
    f(paramInt);
    return true;
  }
  
  void f()
  {
    Editable localEditable = this.q.getText();
    if ((localEditable != null) && (TextUtils.getTrimmedLength(localEditable) > 0))
    {
      c localc = this.L;
      if ((localc == null) || (!localc.onQueryTextSubmit(localEditable.toString())))
      {
        if (this.ga != null) {
          a(0, null, localEditable.toString());
        }
        this.q.setImeVisibility(false);
        ha();
      }
    }
  }
  
  void fa()
  {
    Object localObject = this.ga;
    if (localObject == null) {
      return;
    }
    try
    {
      if (((SearchableInfo)localObject).getVoiceSearchLaunchWebSearch())
      {
        localObject = b(this.I, (SearchableInfo)localObject);
        getContext().startActivity((Intent)localObject);
      }
      else if (((SearchableInfo)localObject).getVoiceSearchLaunchRecognizer())
      {
        localObject = a(this.J, (SearchableInfo)localObject);
        getContext().startActivity((Intent)localObject);
      }
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      Log.w("SearchView", "Could not find voice search activity");
    }
  }
  
  void g()
  {
    j(c());
    ka();
    if (this.q.hasFocus()) {
      b();
    }
  }
  
  void ga()
  {
    int[] arrayOfInt;
    if (this.q.hasFocus()) {
      arrayOfInt = ViewGroup.FOCUSED_STATE_SET;
    } else {
      arrayOfInt = ViewGroup.EMPTY_STATE_SET;
    }
    Drawable localDrawable = this.s.getBackground();
    if (localDrawable != null) {
      localDrawable.setState(arrayOfInt);
    }
    localDrawable = this.t.getBackground();
    if (localDrawable != null) {
      localDrawable.setState(arrayOfInt);
    }
    invalidate();
  }
  
  public int getImeOptions()
  {
    return this.q.getImeOptions();
  }
  
  public int getInputType()
  {
    return this.q.getInputType();
  }
  
  public int getMaxWidth()
  {
    return this.aa;
  }
  
  public CharSequence getQuery()
  {
    return this.q.getText();
  }
  
  public CharSequence getQueryHint()
  {
    Object localObject = this.U;
    if (localObject == null)
    {
      localObject = this.ga;
      if ((localObject != null) && (((SearchableInfo)localObject).getHintId() != 0)) {
        localObject = getContext().getText(this.ga.getHintId());
      } else {
        localObject = this.K;
      }
    }
    return (CharSequence)localObject;
  }
  
  int getSuggestionCommitIconResId()
  {
    return this.H;
  }
  
  int getSuggestionRowLayout()
  {
    return this.G;
  }
  
  public h getSuggestionsAdapter()
  {
    return this.S;
  }
  
  public void onActionViewCollapsed()
  {
    a("", false);
    clearFocus();
    j(true);
    this.q.setImeOptions(this.fa);
    this.ea = false;
  }
  
  public void onActionViewExpanded()
  {
    if (this.ea) {
      return;
    }
    this.ea = true;
    this.fa = this.q.getImeOptions();
    this.q.setImeOptions(this.fa | 0x2000000);
    this.q.setText("");
    setIconified(false);
  }
  
  protected void onDetachedFromWindow()
  {
    removeCallbacks(this.ia);
    post(this.ja);
    super.onDetachedFromWindow();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramBoolean)
    {
      a(this.q, this.A);
      Object localObject = this.B;
      Rect localRect = this.A;
      ((Rect)localObject).set(localRect.left, 0, localRect.right, paramInt4 - paramInt2);
      localObject = this.z;
      if (localObject == null)
      {
        this.z = new f(this.B, this.A, this.q);
        setTouchDelegate(this.z);
      }
      else
      {
        ((f)localObject).a(this.B, this.A);
      }
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (c())
    {
      super.onMeasure(paramInt1, paramInt2);
      return;
    }
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = View.MeasureSpec.getSize(paramInt1);
    if (i != Integer.MIN_VALUE)
    {
      if (i != 0)
      {
        if (i != 1073741824)
        {
          paramInt1 = j;
        }
        else
        {
          i = this.aa;
          paramInt1 = j;
          if (i > 0) {
            paramInt1 = Math.min(i, j);
          }
        }
      }
      else
      {
        paramInt1 = this.aa;
        if (paramInt1 <= 0) {
          paramInt1 = getPreferredWidth();
        }
      }
    }
    else
    {
      paramInt1 = this.aa;
      if (paramInt1 > 0) {
        paramInt1 = Math.min(paramInt1, j);
      } else {
        paramInt1 = Math.min(getPreferredWidth(), j);
      }
    }
    j = View.MeasureSpec.getMode(paramInt2);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    if (j != Integer.MIN_VALUE)
    {
      if (j == 0) {
        paramInt2 = getPreferredHeight();
      }
    }
    else {
      paramInt2 = Math.min(getPreferredHeight(), paramInt2);
    }
    super.onMeasure(View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824), View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824));
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof e))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    paramParcelable = (e)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.l());
    j(paramParcelable.c);
    requestLayout();
  }
  
  protected Parcelable onSaveInstanceState()
  {
    e locale = new e(super.onSaveInstanceState());
    locale.c = c();
    return locale;
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    ka();
  }
  
  public boolean requestFocus(int paramInt, Rect paramRect)
  {
    if (this.W) {
      return false;
    }
    if (!isFocusable()) {
      return false;
    }
    if (!c())
    {
      boolean bool = this.q.requestFocus(paramInt, paramRect);
      if (bool) {
        j(false);
      }
      return bool;
    }
    return super.requestFocus(paramInt, paramRect);
  }
  
  public void setAppSearchData(Bundle paramBundle)
  {
    this.ha = paramBundle;
  }
  
  public void setIconified(boolean paramBoolean)
  {
    if (paramBoolean) {
      d();
    } else {
      e();
    }
  }
  
  public void setIconifiedByDefault(boolean paramBoolean)
  {
    if (this.Q == paramBoolean) {
      return;
    }
    this.Q = paramBoolean;
    j(paramBoolean);
    ma();
  }
  
  public void setImeOptions(int paramInt)
  {
    this.q.setImeOptions(paramInt);
  }
  
  public void setInputType(int paramInt)
  {
    this.q.setInputType(paramInt);
  }
  
  public void setMaxWidth(int paramInt)
  {
    this.aa = paramInt;
    requestLayout();
  }
  
  public void setOnCloseListener(b paramb)
  {
    this.M = paramb;
  }
  
  public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    this.N = paramOnFocusChangeListener;
  }
  
  public void setOnQueryTextListener(c paramc)
  {
    this.L = paramc;
  }
  
  public void setOnSearchClickListener(View.OnClickListener paramOnClickListener)
  {
    this.P = paramOnClickListener;
  }
  
  public void setOnSuggestionListener(d paramd)
  {
    this.O = paramd;
  }
  
  public void setQueryHint(CharSequence paramCharSequence)
  {
    this.U = paramCharSequence;
    ma();
  }
  
  public void setQueryRefinementEnabled(boolean paramBoolean)
  {
    this.V = paramBoolean;
    Object localObject = this.S;
    if ((localObject instanceof ib))
    {
      localObject = (ib)localObject;
      int i;
      if (paramBoolean) {
        i = 2;
      } else {
        i = 1;
      }
      ((ib)localObject).a(i);
    }
  }
  
  public void setSearchableInfo(SearchableInfo paramSearchableInfo)
  {
    this.ga = paramSearchableInfo;
    if (this.ga != null)
    {
      na();
      ma();
    }
    this.ba = ia();
    if (this.ba) {
      this.q.setPrivateImeOptions("nm");
    }
    j(c());
  }
  
  public void setSubmitButtonEnabled(boolean paramBoolean)
  {
    this.T = paramBoolean;
    j(c());
  }
  
  public void setSuggestionsAdapter(h paramh)
  {
    this.S = paramh;
    this.q.setAdapter(this.S);
  }
  
  public static class SearchAutoComplete
    extends j
  {
    private int d = getThreshold();
    private SearchView e;
    private boolean f;
    final Runnable g = new db(this);
    
    public SearchAutoComplete(Context paramContext)
    {
      this(paramContext, null);
    }
    
    public SearchAutoComplete(Context paramContext, AttributeSet paramAttributeSet)
    {
      this(paramContext, paramAttributeSet, Gd.autoCompleteTextViewStyle);
    }
    
    public SearchAutoComplete(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
    {
      super(paramAttributeSet, paramInt);
    }
    
    private int getSearchViewTextMinWidthDp()
    {
      Configuration localConfiguration = getResources().getConfiguration();
      int i = localConfiguration.screenWidthDp;
      int j = localConfiguration.screenHeightDp;
      if ((i >= 960) && (j >= 720) && (localConfiguration.orientation == 2)) {
        return 256;
      }
      if ((i < 600) && ((i < 640) || (j < 480))) {
        return 160;
      }
      return 192;
    }
    
    boolean a()
    {
      boolean bool;
      if (TextUtils.getTrimmedLength(getText()) == 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    void b()
    {
      if (this.f)
      {
        ((InputMethodManager)getContext().getSystemService("input_method")).showSoftInput(this, 0);
        this.f = false;
      }
    }
    
    public boolean enoughToFilter()
    {
      boolean bool;
      if ((this.d > 0) && (!super.enoughToFilter())) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
    {
      paramEditorInfo = super.onCreateInputConnection(paramEditorInfo);
      if (this.f)
      {
        removeCallbacks(this.g);
        post(this.g);
      }
      return paramEditorInfo;
    }
    
    protected void onFinishInflate()
    {
      super.onFinishInflate();
      DisplayMetrics localDisplayMetrics = getResources().getDisplayMetrics();
      setMinWidth((int)TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), localDisplayMetrics));
    }
    
    protected void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect)
    {
      super.onFocusChanged(paramBoolean, paramInt, paramRect);
      this.e.g();
    }
    
    public boolean onKeyPreIme(int paramInt, KeyEvent paramKeyEvent)
    {
      if (paramInt == 4)
      {
        KeyEvent.DispatcherState localDispatcherState;
        if ((paramKeyEvent.getAction() == 0) && (paramKeyEvent.getRepeatCount() == 0))
        {
          localDispatcherState = getKeyDispatcherState();
          if (localDispatcherState != null) {
            localDispatcherState.startTracking(paramKeyEvent, this);
          }
          return true;
        }
        if (paramKeyEvent.getAction() == 1)
        {
          localDispatcherState = getKeyDispatcherState();
          if (localDispatcherState != null) {
            localDispatcherState.handleUpEvent(paramKeyEvent);
          }
          if ((paramKeyEvent.isTracking()) && (!paramKeyEvent.isCanceled()))
          {
            this.e.clearFocus();
            setImeVisibility(false);
            return true;
          }
        }
      }
      return super.onKeyPreIme(paramInt, paramKeyEvent);
    }
    
    public void onWindowFocusChanged(boolean paramBoolean)
    {
      super.onWindowFocusChanged(paramBoolean);
      if ((paramBoolean) && (this.e.hasFocus()) && (getVisibility() == 0))
      {
        this.f = true;
        if (SearchView.a(getContext())) {
          SearchView.p.a(this, true);
        }
      }
    }
    
    public void performCompletion() {}
    
    protected void replaceText(CharSequence paramCharSequence) {}
    
    void setImeVisibility(boolean paramBoolean)
    {
      InputMethodManager localInputMethodManager = (InputMethodManager)getContext().getSystemService("input_method");
      if (!paramBoolean)
      {
        this.f = false;
        removeCallbacks(this.g);
        localInputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        return;
      }
      if (localInputMethodManager.isActive(this))
      {
        this.f = false;
        removeCallbacks(this.g);
        localInputMethodManager.showSoftInput(this, 0);
        return;
      }
      this.f = true;
    }
    
    void setSearchView(SearchView paramSearchView)
    {
      this.e = paramSearchView;
    }
    
    public void setThreshold(int paramInt)
    {
      super.setThreshold(paramInt);
      this.d = paramInt;
    }
  }
  
  private static class a
  {
    private Method a;
    private Method b;
    private Method c;
    
    a()
    {
      try
      {
        this.a = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
        this.a.setAccessible(true);
      }
      catch (NoSuchMethodException localNoSuchMethodException2)
      {
        try
        {
          this.b = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
          this.b.setAccessible(true);
        }
        catch (NoSuchMethodException localNoSuchMethodException2)
        {
          try
          {
            for (;;)
            {
              this.c = AutoCompleteTextView.class.getMethod("ensureImeVisible", new Class[] { Boolean.TYPE });
              this.c.setAccessible(true);
              return;
              localNoSuchMethodException1 = localNoSuchMethodException1;
              continue;
              localNoSuchMethodException2 = localNoSuchMethodException2;
            }
          }
          catch (NoSuchMethodException localNoSuchMethodException3)
          {
            for (;;) {}
          }
        }
      }
    }
    
    void a(AutoCompleteTextView paramAutoCompleteTextView)
    {
      Method localMethod = this.b;
      if (localMethod != null) {}
      try
      {
        localMethod.invoke(paramAutoCompleteTextView, new Object[0]);
        return;
      }
      catch (Exception paramAutoCompleteTextView)
      {
        for (;;) {}
      }
    }
    
    void a(AutoCompleteTextView paramAutoCompleteTextView, boolean paramBoolean)
    {
      Method localMethod = this.c;
      if (localMethod != null) {}
      try
      {
        localMethod.invoke(paramAutoCompleteTextView, new Object[] { Boolean.valueOf(paramBoolean) });
        return;
      }
      catch (Exception paramAutoCompleteTextView)
      {
        for (;;) {}
      }
    }
    
    void b(AutoCompleteTextView paramAutoCompleteTextView)
    {
      Method localMethod = this.a;
      if (localMethod != null) {}
      try
      {
        localMethod.invoke(paramAutoCompleteTextView, new Object[0]);
        return;
      }
      catch (Exception paramAutoCompleteTextView)
      {
        for (;;) {}
      }
    }
  }
  
  public static abstract interface b
  {
    public abstract boolean onClose();
  }
  
  public static abstract interface c
  {
    public abstract boolean onQueryTextChange(String paramString);
    
    public abstract boolean onQueryTextSubmit(String paramString);
  }
  
  public static abstract interface d
  {
    public abstract boolean onSuggestionClick(int paramInt);
    
    public abstract boolean onSuggestionSelect(int paramInt);
  }
  
  static class e
    extends c
  {
    public static final Parcelable.Creator<e> CREATOR = new cb();
    boolean c;
    
    public e(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      super(paramClassLoader);
      this.c = ((Boolean)paramParcel.readValue(null)).booleanValue();
    }
    
    e(Parcelable paramParcelable)
    {
      super();
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("SearchView.SavedState{");
      localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      localStringBuilder.append(" isIconified=");
      localStringBuilder.append(this.c);
      localStringBuilder.append("}");
      return localStringBuilder.toString();
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeValue(Boolean.valueOf(this.c));
    }
  }
  
  private static class f
    extends TouchDelegate
  {
    private final View a;
    private final Rect b;
    private final Rect c;
    private final Rect d;
    private final int e;
    private boolean f;
    
    public f(Rect paramRect1, Rect paramRect2, View paramView)
    {
      super(paramView);
      this.e = ViewConfiguration.get(paramView.getContext()).getScaledTouchSlop();
      this.b = new Rect();
      this.d = new Rect();
      this.c = new Rect();
      a(paramRect1, paramRect2);
      this.a = paramView;
    }
    
    public void a(Rect paramRect1, Rect paramRect2)
    {
      this.b.set(paramRect1);
      this.d.set(paramRect1);
      paramRect1 = this.d;
      int i = this.e;
      paramRect1.inset(-i, -i);
      this.c.set(paramRect2);
    }
    
    public boolean onTouchEvent(MotionEvent paramMotionEvent)
    {
      int i = (int)paramMotionEvent.getX();
      int j = (int)paramMotionEvent.getY();
      int k = paramMotionEvent.getAction();
      int m = 1;
      boolean bool1 = false;
      if (k != 0)
      {
        if ((k != 1) && (k != 2))
        {
          if (k == 3)
          {
            bool2 = this.f;
            this.f = false;
            k = m;
            break label151;
          }
        }
        else
        {
          boolean bool3 = this.f;
          bool2 = bool3;
          k = m;
          if (!bool3) {
            break label151;
          }
          bool2 = bool3;
          k = m;
          if (this.d.contains(i, j)) {
            break label151;
          }
          k = 0;
          bool2 = bool3;
          break label151;
        }
      }
      else if (this.b.contains(i, j))
      {
        this.f = true;
        bool2 = true;
        k = m;
        break label151;
      }
      boolean bool2 = false;
      k = m;
      label151:
      if (bool2)
      {
        if ((k != 0) && (!this.c.contains(i, j)))
        {
          paramMotionEvent.setLocation(this.a.getWidth() / 2, this.a.getHeight() / 2);
        }
        else
        {
          Rect localRect = this.c;
          paramMotionEvent.setLocation(i - localRect.left, j - localRect.top);
        }
        bool1 = this.a.dispatchTouchEvent(paramMotionEvent);
      }
      return bool1;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/SearchView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */