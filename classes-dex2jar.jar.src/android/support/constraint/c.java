package android.support.constraint;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class c
{
  private static final int[] a = { 0, 4, 8 };
  private static SparseIntArray b = new SparseIntArray();
  private HashMap<Integer, a> c = new HashMap();
  
  static
  {
    b.append(g.ConstraintSet_layout_constraintLeft_toLeftOf, 25);
    b.append(g.ConstraintSet_layout_constraintLeft_toRightOf, 26);
    b.append(g.ConstraintSet_layout_constraintRight_toLeftOf, 29);
    b.append(g.ConstraintSet_layout_constraintRight_toRightOf, 30);
    b.append(g.ConstraintSet_layout_constraintTop_toTopOf, 36);
    b.append(g.ConstraintSet_layout_constraintTop_toBottomOf, 35);
    b.append(g.ConstraintSet_layout_constraintBottom_toTopOf, 4);
    b.append(g.ConstraintSet_layout_constraintBottom_toBottomOf, 3);
    b.append(g.ConstraintSet_layout_constraintBaseline_toBaselineOf, 1);
    b.append(g.ConstraintSet_layout_editor_absoluteX, 6);
    b.append(g.ConstraintSet_layout_editor_absoluteY, 7);
    b.append(g.ConstraintSet_layout_constraintGuide_begin, 17);
    b.append(g.ConstraintSet_layout_constraintGuide_end, 18);
    b.append(g.ConstraintSet_layout_constraintGuide_percent, 19);
    b.append(g.ConstraintSet_android_orientation, 27);
    b.append(g.ConstraintSet_layout_constraintStart_toEndOf, 32);
    b.append(g.ConstraintSet_layout_constraintStart_toStartOf, 33);
    b.append(g.ConstraintSet_layout_constraintEnd_toStartOf, 10);
    b.append(g.ConstraintSet_layout_constraintEnd_toEndOf, 9);
    b.append(g.ConstraintSet_layout_goneMarginLeft, 13);
    b.append(g.ConstraintSet_layout_goneMarginTop, 16);
    b.append(g.ConstraintSet_layout_goneMarginRight, 14);
    b.append(g.ConstraintSet_layout_goneMarginBottom, 11);
    b.append(g.ConstraintSet_layout_goneMarginStart, 15);
    b.append(g.ConstraintSet_layout_goneMarginEnd, 12);
    b.append(g.ConstraintSet_layout_constraintVertical_weight, 40);
    b.append(g.ConstraintSet_layout_constraintHorizontal_weight, 39);
    b.append(g.ConstraintSet_layout_constraintHorizontal_chainStyle, 41);
    b.append(g.ConstraintSet_layout_constraintVertical_chainStyle, 42);
    b.append(g.ConstraintSet_layout_constraintHorizontal_bias, 20);
    b.append(g.ConstraintSet_layout_constraintVertical_bias, 37);
    b.append(g.ConstraintSet_layout_constraintDimensionRatio, 5);
    b.append(g.ConstraintSet_layout_constraintLeft_creator, 75);
    b.append(g.ConstraintSet_layout_constraintTop_creator, 75);
    b.append(g.ConstraintSet_layout_constraintRight_creator, 75);
    b.append(g.ConstraintSet_layout_constraintBottom_creator, 75);
    b.append(g.ConstraintSet_layout_constraintBaseline_creator, 75);
    b.append(g.ConstraintSet_android_layout_marginLeft, 24);
    b.append(g.ConstraintSet_android_layout_marginRight, 28);
    b.append(g.ConstraintSet_android_layout_marginStart, 31);
    b.append(g.ConstraintSet_android_layout_marginEnd, 8);
    b.append(g.ConstraintSet_android_layout_marginTop, 34);
    b.append(g.ConstraintSet_android_layout_marginBottom, 2);
    b.append(g.ConstraintSet_android_layout_width, 23);
    b.append(g.ConstraintSet_android_layout_height, 21);
    b.append(g.ConstraintSet_android_visibility, 22);
    b.append(g.ConstraintSet_android_alpha, 43);
    b.append(g.ConstraintSet_android_elevation, 44);
    b.append(g.ConstraintSet_android_rotationX, 45);
    b.append(g.ConstraintSet_android_rotationY, 46);
    b.append(g.ConstraintSet_android_rotation, 60);
    b.append(g.ConstraintSet_android_scaleX, 47);
    b.append(g.ConstraintSet_android_scaleY, 48);
    b.append(g.ConstraintSet_android_transformPivotX, 49);
    b.append(g.ConstraintSet_android_transformPivotY, 50);
    b.append(g.ConstraintSet_android_translationX, 51);
    b.append(g.ConstraintSet_android_translationY, 52);
    b.append(g.ConstraintSet_android_translationZ, 53);
    b.append(g.ConstraintSet_layout_constraintWidth_default, 54);
    b.append(g.ConstraintSet_layout_constraintHeight_default, 55);
    b.append(g.ConstraintSet_layout_constraintWidth_max, 56);
    b.append(g.ConstraintSet_layout_constraintHeight_max, 57);
    b.append(g.ConstraintSet_layout_constraintWidth_min, 58);
    b.append(g.ConstraintSet_layout_constraintHeight_min, 59);
    b.append(g.ConstraintSet_layout_constraintCircle, 61);
    b.append(g.ConstraintSet_layout_constraintCircleRadius, 62);
    b.append(g.ConstraintSet_layout_constraintCircleAngle, 63);
    b.append(g.ConstraintSet_android_id, 38);
    b.append(g.ConstraintSet_layout_constraintWidth_percent, 69);
    b.append(g.ConstraintSet_layout_constraintHeight_percent, 70);
    b.append(g.ConstraintSet_chainUseRtl, 71);
    b.append(g.ConstraintSet_barrierDirection, 72);
    b.append(g.ConstraintSet_constraint_referenced_ids, 73);
    b.append(g.ConstraintSet_barrierAllowsGoneWidgets, 74);
  }
  
  private static int a(TypedArray paramTypedArray, int paramInt1, int paramInt2)
  {
    int i = paramTypedArray.getResourceId(paramInt1, paramInt2);
    paramInt2 = i;
    if (i == -1) {
      paramInt2 = paramTypedArray.getInt(paramInt1, -1);
    }
    return paramInt2;
  }
  
  private a a(int paramInt)
  {
    if (!this.c.containsKey(Integer.valueOf(paramInt))) {
      this.c.put(Integer.valueOf(paramInt), new a(null));
    }
    return (a)this.c.get(Integer.valueOf(paramInt));
  }
  
  private a a(Context paramContext, AttributeSet paramAttributeSet)
  {
    a locala = new a(null);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, g.ConstraintSet);
    a(locala, paramContext);
    paramContext.recycle();
    return locala;
  }
  
  private void a(a parama, TypedArray paramTypedArray)
  {
    int i = paramTypedArray.getIndexCount();
    for (int j = 0; j < i; j++)
    {
      int k = paramTypedArray.getIndex(j);
      int m = b.get(k);
      switch (m)
      {
      default: 
        switch (m)
        {
        default: 
          StringBuilder localStringBuilder;
          switch (m)
          {
          default: 
            localStringBuilder = new StringBuilder();
            localStringBuilder.append("Unknown attribute 0x");
            localStringBuilder.append(Integer.toHexString(k));
            localStringBuilder.append("   ");
            localStringBuilder.append(b.get(k));
            Log.w("ConstraintSet", localStringBuilder.toString());
            break;
          case 75: 
            localStringBuilder = new StringBuilder();
            localStringBuilder.append("unused attribute 0x");
            localStringBuilder.append(Integer.toHexString(k));
            localStringBuilder.append("   ");
            localStringBuilder.append(b.get(k));
            Log.w("ConstraintSet", localStringBuilder.toString());
            break;
          case 74: 
            parama.ra = paramTypedArray.getBoolean(k, parama.ra);
            break;
          case 73: 
            parama.va = paramTypedArray.getString(k);
            break;
          case 72: 
            parama.sa = paramTypedArray.getInt(k, parama.sa);
            break;
          case 71: 
            Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
            break;
          case 70: 
            parama.qa = paramTypedArray.getFloat(k, 1.0F);
            break;
          case 69: 
            parama.pa = paramTypedArray.getFloat(k, 1.0F);
          }
          break;
        case 63: 
          parama.z = paramTypedArray.getFloat(k, parama.z);
          break;
        case 62: 
          parama.y = paramTypedArray.getDimensionPixelSize(k, parama.y);
          break;
        case 61: 
          parama.x = a(paramTypedArray, k, parama.x);
          break;
        case 60: 
          parama.X = paramTypedArray.getFloat(k, parama.X);
        }
        break;
      case 53: 
        parama.ga = paramTypedArray.getDimension(k, parama.ga);
        break;
      case 52: 
        parama.fa = paramTypedArray.getDimension(k, parama.fa);
        break;
      case 51: 
        parama.ea = paramTypedArray.getDimension(k, parama.ea);
        break;
      case 50: 
        parama.da = paramTypedArray.getFloat(k, parama.da);
        break;
      case 49: 
        parama.ca = paramTypedArray.getFloat(k, parama.ca);
        break;
      case 48: 
        parama.ba = paramTypedArray.getFloat(k, parama.ba);
        break;
      case 47: 
        parama.aa = paramTypedArray.getFloat(k, parama.aa);
        break;
      case 46: 
        parama.Z = paramTypedArray.getFloat(k, parama.Z);
        break;
      case 45: 
        parama.Y = paramTypedArray.getFloat(k, parama.Y);
        break;
      case 44: 
        parama.V = true;
        parama.W = paramTypedArray.getDimension(k, parama.W);
        break;
      case 43: 
        parama.U = paramTypedArray.getFloat(k, parama.U);
        break;
      case 42: 
        parama.T = paramTypedArray.getInt(k, parama.T);
        break;
      case 41: 
        parama.S = paramTypedArray.getInt(k, parama.S);
        break;
      case 40: 
        parama.Q = paramTypedArray.getFloat(k, parama.Q);
        break;
      case 39: 
        parama.R = paramTypedArray.getFloat(k, parama.R);
        break;
      case 38: 
        parama.d = paramTypedArray.getResourceId(k, parama.d);
        break;
      case 37: 
        parama.v = paramTypedArray.getFloat(k, parama.v);
        break;
      case 36: 
        parama.l = a(paramTypedArray, k, parama.l);
        break;
      case 35: 
        parama.m = a(paramTypedArray, k, parama.m);
        break;
      case 34: 
        parama.F = paramTypedArray.getDimensionPixelSize(k, parama.F);
        break;
      case 33: 
        parama.r = a(paramTypedArray, k, parama.r);
        break;
      case 32: 
        parama.q = a(paramTypedArray, k, parama.q);
        break;
      case 31: 
        parama.I = paramTypedArray.getDimensionPixelSize(k, parama.I);
        break;
      case 30: 
        parama.k = a(paramTypedArray, k, parama.k);
        break;
      case 29: 
        parama.j = a(paramTypedArray, k, parama.j);
        break;
      case 28: 
        parama.E = paramTypedArray.getDimensionPixelSize(k, parama.E);
        break;
      case 27: 
        parama.C = paramTypedArray.getInt(k, parama.C);
        break;
      case 26: 
        parama.i = a(paramTypedArray, k, parama.i);
        break;
      case 25: 
        parama.h = a(paramTypedArray, k, parama.h);
        break;
      case 24: 
        parama.D = paramTypedArray.getDimensionPixelSize(k, parama.D);
        break;
      case 23: 
        parama.b = paramTypedArray.getLayoutDimension(k, parama.b);
        break;
      case 22: 
        parama.J = paramTypedArray.getInt(k, parama.J);
        parama.J = a[parama.J];
        break;
      case 21: 
        parama.c = paramTypedArray.getLayoutDimension(k, parama.c);
        break;
      case 20: 
        parama.u = paramTypedArray.getFloat(k, parama.u);
        break;
      case 19: 
        parama.g = paramTypedArray.getFloat(k, parama.g);
        break;
      case 18: 
        parama.f = paramTypedArray.getDimensionPixelOffset(k, parama.f);
        break;
      case 17: 
        parama.e = paramTypedArray.getDimensionPixelOffset(k, parama.e);
        break;
      case 16: 
        parama.L = paramTypedArray.getDimensionPixelSize(k, parama.L);
        break;
      case 15: 
        parama.P = paramTypedArray.getDimensionPixelSize(k, parama.P);
        break;
      case 14: 
        parama.M = paramTypedArray.getDimensionPixelSize(k, parama.M);
        break;
      case 13: 
        parama.K = paramTypedArray.getDimensionPixelSize(k, parama.K);
        break;
      case 12: 
        parama.O = paramTypedArray.getDimensionPixelSize(k, parama.O);
        break;
      case 11: 
        parama.N = paramTypedArray.getDimensionPixelSize(k, parama.N);
        break;
      case 10: 
        parama.s = a(paramTypedArray, k, parama.s);
        break;
      case 9: 
        parama.t = a(paramTypedArray, k, parama.t);
        break;
      case 8: 
        parama.H = paramTypedArray.getDimensionPixelSize(k, parama.H);
        break;
      case 7: 
        parama.B = paramTypedArray.getDimensionPixelOffset(k, parama.B);
        break;
      case 6: 
        parama.A = paramTypedArray.getDimensionPixelOffset(k, parama.A);
        break;
      case 5: 
        parama.w = paramTypedArray.getString(k);
        break;
      case 4: 
        parama.n = a(paramTypedArray, k, parama.n);
        break;
      case 3: 
        parama.o = a(paramTypedArray, k, parama.o);
        break;
      case 2: 
        parama.G = paramTypedArray.getDimensionPixelSize(k, parama.G);
        break;
      case 1: 
        parama.p = a(paramTypedArray, k, parama.p);
      }
    }
  }
  
  private int[] a(View paramView, String paramString)
  {
    String[] arrayOfString = paramString.split(",");
    Context localContext = paramView.getContext();
    paramString = new int[arrayOfString.length];
    int i = 0;
    for (int j = 0; i < arrayOfString.length; j++)
    {
      String str = arrayOfString[i].trim();
      try
      {
        k = f.class.getField(str).getInt(null);
      }
      catch (Exception localException)
      {
        k = 0;
      }
      int m = k;
      if (k == 0) {
        m = localContext.getResources().getIdentifier(str, "id", localContext.getPackageName());
      }
      int k = m;
      if (m == 0)
      {
        k = m;
        if (paramView.isInEditMode())
        {
          k = m;
          if ((paramView.getParent() instanceof ConstraintLayout))
          {
            Object localObject = ((ConstraintLayout)paramView.getParent()).a(0, str);
            k = m;
            if (localObject != null)
            {
              k = m;
              if ((localObject instanceof Integer)) {
                k = ((Integer)localObject).intValue();
              }
            }
          }
        }
      }
      paramString[j] = k;
      i++;
    }
    paramView = paramString;
    if (j != arrayOfString.length) {
      paramView = Arrays.copyOf(paramString, j);
    }
    return paramView;
  }
  
  public void a(int paramInt, float paramFloat)
  {
    a(paramInt).v = paramFloat;
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    if (this.c.containsKey(Integer.valueOf(paramInt1)))
    {
      a locala = (a)this.c.get(Integer.valueOf(paramInt1));
      switch (paramInt2)
      {
      default: 
        throw new IllegalArgumentException("unknown constraint");
      case 7: 
        locala.s = -1;
        locala.t = -1;
        locala.H = -1;
        locala.O = -1;
        break;
      case 6: 
        locala.q = -1;
        locala.r = -1;
        locala.I = -1;
        locala.P = -1;
        break;
      case 5: 
        locala.p = -1;
        break;
      case 4: 
        locala.n = -1;
        locala.o = -1;
        locala.G = -1;
        locala.N = -1;
        break;
      case 3: 
        locala.m = -1;
        locala.l = -1;
        locala.F = -1;
        locala.L = -1;
        break;
      case 2: 
        locala.k = -1;
        locala.j = -1;
        locala.E = -1;
        locala.M = -1;
        break;
      case 1: 
        locala.i = -1;
        locala.h = -1;
        locala.D = -1;
        locala.K = -1;
      }
    }
  }
  
  public void a(int paramInt, String paramString)
  {
    a(paramInt).w = paramString;
  }
  
  public void a(Context paramContext, int paramInt)
  {
    c((ConstraintLayout)LayoutInflater.from(paramContext).inflate(paramInt, null));
  }
  
  public void a(ConstraintLayout paramConstraintLayout)
  {
    b(paramConstraintLayout);
    paramConstraintLayout.setConstraintSet(null);
  }
  
  public void a(c paramc)
  {
    this.c.clear();
    Iterator localIterator = paramc.c.keySet().iterator();
    while (localIterator.hasNext())
    {
      Integer localInteger = (Integer)localIterator.next();
      this.c.put(localInteger, ((a)paramc.c.get(localInteger)).clone());
    }
  }
  
  public void a(d paramd)
  {
    int i = paramd.getChildCount();
    this.c.clear();
    int j = 0;
    while (j < i)
    {
      View localView = paramd.getChildAt(j);
      d.a locala = (d.a)localView.getLayoutParams();
      int k = localView.getId();
      if (k != -1)
      {
        if (!this.c.containsKey(Integer.valueOf(k))) {
          this.c.put(Integer.valueOf(k), new a(null));
        }
        a locala1 = (a)this.c.get(Integer.valueOf(k));
        if ((localView instanceof a)) {
          a.a(locala1, (a)localView, k, locala);
        }
        a.a(locala1, k, locala);
        j++;
      }
      else
      {
        throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
      }
    }
  }
  
  public void b(int paramInt1, int paramInt2)
  {
    a(paramInt1).J = paramInt2;
  }
  
  public void b(Context paramContext, int paramInt)
  {
    XmlResourceParser localXmlResourceParser = paramContext.getResources().getXml(paramInt);
    try
    {
      for (paramInt = localXmlResourceParser.getEventType(); paramInt != 1; paramInt = localXmlResourceParser.next()) {
        if (paramInt != 0)
        {
          if (paramInt == 2)
          {
            String str = localXmlResourceParser.getName();
            a locala = a(paramContext, Xml.asAttributeSet(localXmlResourceParser));
            if (str.equalsIgnoreCase("Guideline")) {
              locala.a = true;
            }
            this.c.put(Integer.valueOf(locala.d), locala);
          }
        }
        else {
          localXmlResourceParser.getName();
        }
      }
      return;
    }
    catch (IOException paramContext)
    {
      paramContext.printStackTrace();
    }
    catch (XmlPullParserException paramContext)
    {
      paramContext.printStackTrace();
    }
  }
  
  void b(ConstraintLayout paramConstraintLayout)
  {
    int i = paramConstraintLayout.getChildCount();
    Object localObject1 = new HashSet(this.c.keySet());
    int j = 0;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    Object localObject5;
    while (j < i)
    {
      localObject2 = paramConstraintLayout.getChildAt(j);
      int k = ((View)localObject2).getId();
      if (k != -1)
      {
        if (this.c.containsKey(Integer.valueOf(k)))
        {
          ((HashSet)localObject1).remove(Integer.valueOf(k));
          localObject3 = (a)this.c.get(Integer.valueOf(k));
          if ((localObject2 instanceof Barrier)) {
            ((a)localObject3).ta = 1;
          }
          int m = ((a)localObject3).ta;
          if ((m != -1) && (m == 1))
          {
            localObject4 = (Barrier)localObject2;
            ((View)localObject4).setId(k);
            ((Barrier)localObject4).setType(((a)localObject3).sa);
            ((Barrier)localObject4).setAllowsGoneWidget(((a)localObject3).ra);
            localObject5 = ((a)localObject3).ua;
            if (localObject5 != null)
            {
              ((a)localObject4).setReferencedIds((int[])localObject5);
            }
            else
            {
              localObject5 = ((a)localObject3).va;
              if (localObject5 != null)
              {
                ((a)localObject3).ua = a((View)localObject4, (String)localObject5);
                ((a)localObject4).setReferencedIds(((a)localObject3).ua);
              }
            }
          }
          localObject4 = (ConstraintLayout.a)((View)localObject2).getLayoutParams();
          ((a)localObject3).a((ConstraintLayout.a)localObject4);
          ((View)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject4);
          ((View)localObject2).setVisibility(((a)localObject3).J);
          if (Build.VERSION.SDK_INT >= 17)
          {
            ((View)localObject2).setAlpha(((a)localObject3).U);
            ((View)localObject2).setRotation(((a)localObject3).X);
            ((View)localObject2).setRotationX(((a)localObject3).Y);
            ((View)localObject2).setRotationY(((a)localObject3).Z);
            ((View)localObject2).setScaleX(((a)localObject3).aa);
            ((View)localObject2).setScaleY(((a)localObject3).ba);
            if (!Float.isNaN(((a)localObject3).ca)) {
              ((View)localObject2).setPivotX(((a)localObject3).ca);
            }
            if (!Float.isNaN(((a)localObject3).da)) {
              ((View)localObject2).setPivotY(((a)localObject3).da);
            }
            ((View)localObject2).setTranslationX(((a)localObject3).ea);
            ((View)localObject2).setTranslationY(((a)localObject3).fa);
            if (Build.VERSION.SDK_INT >= 21)
            {
              ((View)localObject2).setTranslationZ(((a)localObject3).ga);
              if (((a)localObject3).V) {
                ((View)localObject2).setElevation(((a)localObject3).W);
              }
            }
          }
        }
        j++;
      }
      else
      {
        throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
      }
    }
    localObject1 = ((HashSet)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject3 = (Integer)((Iterator)localObject1).next();
      localObject2 = (a)this.c.get(localObject3);
      j = ((a)localObject2).ta;
      if ((j != -1) && (j == 1))
      {
        localObject4 = new Barrier(paramConstraintLayout.getContext());
        ((View)localObject4).setId(((Integer)localObject3).intValue());
        localObject5 = ((a)localObject2).ua;
        if (localObject5 != null)
        {
          ((a)localObject4).setReferencedIds((int[])localObject5);
        }
        else
        {
          localObject5 = ((a)localObject2).va;
          if (localObject5 != null)
          {
            ((a)localObject2).ua = a((View)localObject4, (String)localObject5);
            ((a)localObject4).setReferencedIds(((a)localObject2).ua);
          }
        }
        ((Barrier)localObject4).setType(((a)localObject2).sa);
        localObject5 = paramConstraintLayout.generateDefaultLayoutParams();
        ((a)localObject4).a();
        ((a)localObject2).a((ConstraintLayout.a)localObject5);
        paramConstraintLayout.addView((View)localObject4, (ViewGroup.LayoutParams)localObject5);
      }
      if (((a)localObject2).a)
      {
        localObject4 = new Guideline(paramConstraintLayout.getContext());
        ((View)localObject4).setId(((Integer)localObject3).intValue());
        localObject3 = paramConstraintLayout.generateDefaultLayoutParams();
        ((a)localObject2).a((ConstraintLayout.a)localObject3);
        paramConstraintLayout.addView((View)localObject4, (ViewGroup.LayoutParams)localObject3);
      }
    }
  }
  
  public void c(ConstraintLayout paramConstraintLayout)
  {
    int i = paramConstraintLayout.getChildCount();
    this.c.clear();
    int j = 0;
    while (j < i)
    {
      View localView = paramConstraintLayout.getChildAt(j);
      Object localObject = (ConstraintLayout.a)localView.getLayoutParams();
      int k = localView.getId();
      if (k != -1)
      {
        if (!this.c.containsKey(Integer.valueOf(k))) {
          this.c.put(Integer.valueOf(k), new a(null));
        }
        a locala = (a)this.c.get(Integer.valueOf(k));
        a.a(locala, k, (ConstraintLayout.a)localObject);
        locala.J = localView.getVisibility();
        if (Build.VERSION.SDK_INT >= 17)
        {
          locala.U = localView.getAlpha();
          locala.X = localView.getRotation();
          locala.Y = localView.getRotationX();
          locala.Z = localView.getRotationY();
          locala.aa = localView.getScaleX();
          locala.ba = localView.getScaleY();
          float f1 = localView.getPivotX();
          float f2 = localView.getPivotY();
          if ((f1 != 0.0D) || (f2 != 0.0D))
          {
            locala.ca = f1;
            locala.da = f2;
          }
          locala.ea = localView.getTranslationX();
          locala.fa = localView.getTranslationY();
          if (Build.VERSION.SDK_INT >= 21)
          {
            locala.ga = localView.getTranslationZ();
            if (locala.V) {
              locala.W = localView.getElevation();
            }
          }
        }
        if ((localView instanceof Barrier))
        {
          localObject = (Barrier)localView;
          locala.ra = ((Barrier)localObject).b();
          locala.ua = ((a)localObject).getReferencedIds();
          locala.sa = ((Barrier)localObject).getType();
        }
        j++;
      }
      else
      {
        throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
      }
    }
  }
  
  private static class a
  {
    public int A = -1;
    public int B = -1;
    public int C = -1;
    public int D = -1;
    public int E = -1;
    public int F = -1;
    public int G = -1;
    public int H = -1;
    public int I = -1;
    public int J = 0;
    public int K = -1;
    public int L = -1;
    public int M = -1;
    public int N = -1;
    public int O = -1;
    public int P = -1;
    public float Q = 0.0F;
    public float R = 0.0F;
    public int S = 0;
    public int T = 0;
    public float U = 1.0F;
    public boolean V = false;
    public float W = 0.0F;
    public float X = 0.0F;
    public float Y = 0.0F;
    public float Z = 0.0F;
    boolean a = false;
    public float aa = 1.0F;
    public int b;
    public float ba = 1.0F;
    public int c;
    public float ca = NaN.0F;
    int d;
    public float da = NaN.0F;
    public int e = -1;
    public float ea = 0.0F;
    public int f = -1;
    public float fa = 0.0F;
    public float g = -1.0F;
    public float ga = 0.0F;
    public int h = -1;
    public boolean ha = false;
    public int i = -1;
    public boolean ia = false;
    public int j = -1;
    public int ja = 0;
    public int k = -1;
    public int ka = 0;
    public int l = -1;
    public int la = -1;
    public int m = -1;
    public int ma = -1;
    public int n = -1;
    public int na = -1;
    public int o = -1;
    public int oa = -1;
    public int p = -1;
    public float pa = 1.0F;
    public int q = -1;
    public float qa = 1.0F;
    public int r = -1;
    public boolean ra = false;
    public int s = -1;
    public int sa = -1;
    public int t = -1;
    public int ta = -1;
    public float u = 0.5F;
    public int[] ua;
    public float v = 0.5F;
    public String va;
    public String w = null;
    public int x = -1;
    public int y = 0;
    public float z = 0.0F;
    
    private void a(int paramInt, ConstraintLayout.a parama)
    {
      this.d = paramInt;
      this.h = parama.d;
      this.i = parama.e;
      this.j = parama.f;
      this.k = parama.g;
      this.l = parama.h;
      this.m = parama.i;
      this.n = parama.j;
      this.o = parama.k;
      this.p = parama.l;
      this.q = parama.p;
      this.r = parama.q;
      this.s = parama.r;
      this.t = parama.s;
      this.u = parama.z;
      this.v = parama.A;
      this.w = parama.B;
      this.x = parama.m;
      this.y = parama.n;
      this.z = parama.o;
      this.A = parama.Q;
      this.B = parama.R;
      this.C = parama.S;
      this.g = parama.c;
      this.e = parama.a;
      this.f = parama.b;
      this.b = parama.width;
      this.c = parama.height;
      this.D = parama.leftMargin;
      this.E = parama.rightMargin;
      this.F = parama.topMargin;
      this.G = parama.bottomMargin;
      this.Q = parama.F;
      this.R = parama.E;
      this.T = parama.H;
      this.S = parama.G;
      boolean bool = parama.T;
      this.ha = bool;
      this.ia = parama.U;
      this.ja = parama.I;
      this.ka = parama.J;
      this.ha = bool;
      this.la = parama.M;
      this.ma = parama.N;
      this.na = parama.K;
      this.oa = parama.L;
      this.pa = parama.O;
      this.qa = parama.P;
      if (Build.VERSION.SDK_INT >= 17)
      {
        this.H = parama.getMarginEnd();
        this.I = parama.getMarginStart();
      }
    }
    
    private void a(int paramInt, d.a parama)
    {
      a(paramInt, parama);
      this.U = parama.na;
      this.X = parama.qa;
      this.Y = parama.ra;
      this.Z = parama.sa;
      this.aa = parama.ta;
      this.ba = parama.ua;
      this.ca = parama.va;
      this.da = parama.wa;
      this.ea = parama.xa;
      this.fa = parama.ya;
      this.ga = parama.za;
      this.W = parama.pa;
      this.V = parama.oa;
    }
    
    private void a(a parama, int paramInt, d.a parama1)
    {
      a(paramInt, parama1);
      if ((parama instanceof Barrier))
      {
        this.ta = 1;
        parama = (Barrier)parama;
        this.sa = parama.getType();
        this.ua = parama.getReferencedIds();
      }
    }
    
    public void a(ConstraintLayout.a parama)
    {
      parama.d = this.h;
      parama.e = this.i;
      parama.f = this.j;
      parama.g = this.k;
      parama.h = this.l;
      parama.i = this.m;
      parama.j = this.n;
      parama.k = this.o;
      parama.l = this.p;
      parama.p = this.q;
      parama.q = this.r;
      parama.r = this.s;
      parama.s = this.t;
      parama.leftMargin = this.D;
      parama.rightMargin = this.E;
      parama.topMargin = this.F;
      parama.bottomMargin = this.G;
      parama.x = this.P;
      parama.y = this.O;
      parama.z = this.u;
      parama.A = this.v;
      parama.m = this.x;
      parama.n = this.y;
      parama.o = this.z;
      parama.B = this.w;
      parama.Q = this.A;
      parama.R = this.B;
      parama.F = this.Q;
      parama.E = this.R;
      parama.H = this.T;
      parama.G = this.S;
      parama.T = this.ha;
      parama.U = this.ia;
      parama.I = this.ja;
      parama.J = this.ka;
      parama.M = this.la;
      parama.N = this.ma;
      parama.K = this.na;
      parama.L = this.oa;
      parama.O = this.pa;
      parama.P = this.qa;
      parama.S = this.C;
      parama.c = this.g;
      parama.a = this.e;
      parama.b = this.f;
      parama.width = this.b;
      parama.height = this.c;
      if (Build.VERSION.SDK_INT >= 17)
      {
        parama.setMarginStart(this.I);
        parama.setMarginEnd(this.H);
      }
      parama.a();
    }
    
    public a clone()
    {
      a locala = new a();
      locala.a = this.a;
      locala.b = this.b;
      locala.c = this.c;
      locala.e = this.e;
      locala.f = this.f;
      locala.g = this.g;
      locala.h = this.h;
      locala.i = this.i;
      locala.j = this.j;
      locala.k = this.k;
      locala.l = this.l;
      locala.m = this.m;
      locala.n = this.n;
      locala.o = this.o;
      locala.p = this.p;
      locala.q = this.q;
      locala.r = this.r;
      locala.s = this.s;
      locala.t = this.t;
      locala.u = this.u;
      locala.v = this.v;
      locala.w = this.w;
      locala.A = this.A;
      locala.B = this.B;
      locala.u = this.u;
      locala.u = this.u;
      locala.u = this.u;
      locala.u = this.u;
      locala.u = this.u;
      locala.C = this.C;
      locala.D = this.D;
      locala.E = this.E;
      locala.F = this.F;
      locala.G = this.G;
      locala.H = this.H;
      locala.I = this.I;
      locala.J = this.J;
      locala.K = this.K;
      locala.L = this.L;
      locala.M = this.M;
      locala.N = this.N;
      locala.O = this.O;
      locala.P = this.P;
      locala.Q = this.Q;
      locala.R = this.R;
      locala.S = this.S;
      locala.T = this.T;
      locala.U = this.U;
      locala.V = this.V;
      locala.W = this.W;
      locala.X = this.X;
      locala.Y = this.Y;
      locala.Z = this.Z;
      locala.aa = this.aa;
      locala.ba = this.ba;
      locala.ca = this.ca;
      locala.da = this.da;
      locala.ea = this.ea;
      locala.fa = this.fa;
      locala.ga = this.ga;
      locala.ha = this.ha;
      locala.ia = this.ia;
      locala.ja = this.ja;
      locala.ka = this.ka;
      locala.la = this.la;
      locala.ma = this.ma;
      locala.na = this.na;
      locala.oa = this.oa;
      locala.pa = this.pa;
      locala.qa = this.qa;
      locala.sa = this.sa;
      locala.ta = this.ta;
      int[] arrayOfInt = this.ua;
      if (arrayOfInt != null) {
        locala.ua = Arrays.copyOf(arrayOfInt, arrayOfInt.length);
      }
      locala.x = this.x;
      locala.y = this.y;
      locala.z = this.z;
      locala.ra = this.ra;
      return locala;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/constraint/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */