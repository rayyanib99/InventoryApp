// Generated by view binder compiler. Do not edit!
package com.example.option1_inventoryapp_rayyanabdulmunib.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.option1_inventoryapp_rayyanabdulmunib.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemLayoutBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnAdd;

  @NonNull
  public final Button btnDelete;

  @NonNull
  public final Button btnSubtract;

  @NonNull
  public final TextView itemDescription;

  @NonNull
  public final ImageView itemImage;

  @NonNull
  public final TextView itemName;

  @NonNull
  public final TextView itemQuantity;

  private ItemLayoutBinding(@NonNull LinearLayout rootView, @NonNull Button btnAdd,
      @NonNull Button btnDelete, @NonNull Button btnSubtract, @NonNull TextView itemDescription,
      @NonNull ImageView itemImage, @NonNull TextView itemName, @NonNull TextView itemQuantity) {
    this.rootView = rootView;
    this.btnAdd = btnAdd;
    this.btnDelete = btnDelete;
    this.btnSubtract = btnSubtract;
    this.itemDescription = itemDescription;
    this.itemImage = itemImage;
    this.itemName = itemName;
    this.itemQuantity = itemQuantity;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnAdd;
      Button btnAdd = ViewBindings.findChildViewById(rootView, id);
      if (btnAdd == null) {
        break missingId;
      }

      id = R.id.btnDelete;
      Button btnDelete = ViewBindings.findChildViewById(rootView, id);
      if (btnDelete == null) {
        break missingId;
      }

      id = R.id.btnSubtract;
      Button btnSubtract = ViewBindings.findChildViewById(rootView, id);
      if (btnSubtract == null) {
        break missingId;
      }

      id = R.id.itemDescription;
      TextView itemDescription = ViewBindings.findChildViewById(rootView, id);
      if (itemDescription == null) {
        break missingId;
      }

      id = R.id.itemImage;
      ImageView itemImage = ViewBindings.findChildViewById(rootView, id);
      if (itemImage == null) {
        break missingId;
      }

      id = R.id.itemName;
      TextView itemName = ViewBindings.findChildViewById(rootView, id);
      if (itemName == null) {
        break missingId;
      }

      id = R.id.itemQuantity;
      TextView itemQuantity = ViewBindings.findChildViewById(rootView, id);
      if (itemQuantity == null) {
        break missingId;
      }

      return new ItemLayoutBinding((LinearLayout) rootView, btnAdd, btnDelete, btnSubtract,
          itemDescription, itemImage, itemName, itemQuantity);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}