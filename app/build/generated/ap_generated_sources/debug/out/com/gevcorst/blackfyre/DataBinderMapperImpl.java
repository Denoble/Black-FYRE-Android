package com.gevcorst.blackfyre;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.gevcorst.blackfyre.databinding.ActivityMainBindingImpl;
import com.gevcorst.blackfyre.databinding.HotSpotBindingImpl;
import com.gevcorst.blackfyre.databinding.LoginFragmentBindingImpl;
import com.gevcorst.blackfyre.databinding.LoginFragmentBindingLandImpl;
import com.gevcorst.blackfyre.databinding.MainscreenBindingImpl;
import com.gevcorst.blackfyre.databinding.ProfileBindingImpl;
import com.gevcorst.blackfyre.databinding.RegisterProfileBindingImpl;
import com.gevcorst.blackfyre.databinding.RegisterProfileBindingLandImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_HOTSPOT = 2;

  private static final int LAYOUT_LOGINFRAGMENT = 3;

  private static final int LAYOUT_MAINSCREEN = 4;

  private static final int LAYOUT_PROFILE = 5;

  private static final int LAYOUT_REGISTERPROFILE = 6;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(6);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gevcorst.blackfyre.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gevcorst.blackfyre.R.layout.hot_spot, LAYOUT_HOTSPOT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gevcorst.blackfyre.R.layout.login_fragment, LAYOUT_LOGINFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gevcorst.blackfyre.R.layout.mainscreen, LAYOUT_MAINSCREEN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gevcorst.blackfyre.R.layout.profile, LAYOUT_PROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gevcorst.blackfyre.R.layout.register_profile, LAYOUT_REGISTERPROFILE);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_HOTSPOT: {
          if ("layout/hot_spot_0".equals(tag)) {
            return new HotSpotBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for hot_spot is invalid. Received: " + tag);
        }
        case  LAYOUT_LOGINFRAGMENT: {
          if ("layout/login_fragment_0".equals(tag)) {
            return new LoginFragmentBindingImpl(component, view);
          }
          if ("layout-land/login_fragment_0".equals(tag)) {
            return new LoginFragmentBindingLandImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for login_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_MAINSCREEN: {
          if ("layout/mainscreen_0".equals(tag)) {
            return new MainscreenBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for mainscreen is invalid. Received: " + tag);
        }
        case  LAYOUT_PROFILE: {
          if ("layout/profile_0".equals(tag)) {
            return new ProfileBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for profile is invalid. Received: " + tag);
        }
        case  LAYOUT_REGISTERPROFILE: {
          if ("layout/register_profile_0".equals(tag)) {
            return new RegisterProfileBindingImpl(component, view);
          }
          if ("layout-land/register_profile_0".equals(tag)) {
            return new RegisterProfileBindingLandImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for register_profile is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(8);

    static {
      sKeys.put("layout/activity_main_0", com.gevcorst.blackfyre.R.layout.activity_main);
      sKeys.put("layout/hot_spot_0", com.gevcorst.blackfyre.R.layout.hot_spot);
      sKeys.put("layout/login_fragment_0", com.gevcorst.blackfyre.R.layout.login_fragment);
      sKeys.put("layout-land/login_fragment_0", com.gevcorst.blackfyre.R.layout.login_fragment);
      sKeys.put("layout/mainscreen_0", com.gevcorst.blackfyre.R.layout.mainscreen);
      sKeys.put("layout/profile_0", com.gevcorst.blackfyre.R.layout.profile);
      sKeys.put("layout/register_profile_0", com.gevcorst.blackfyre.R.layout.register_profile);
      sKeys.put("layout-land/register_profile_0", com.gevcorst.blackfyre.R.layout.register_profile);
    }
  }
}
