package androidx.activity;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OnBackPressedCallback.kt */
@Metadata(m26d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0007H\u0001J\b\u0010\u0015\u001a\u00020\nH\u0017J\b\u0010\u0016\u001a\u00020\nH'J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0019H\u0017J\u0010\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0019H\u0017J\b\u0010\u001b\u001a\u00020\nH\u0007J\u0010\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0007H\u0001R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR&\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00038G@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0004¨\u0006\u001d"}, m25d2 = {"Landroidx/activity/OnBackPressedCallback;", "", "enabled", "", "(Z)V", "cancellables", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/activity/Cancellable;", "enabledChangedCallback", "Lkotlin/Function0;", "", "getEnabledChangedCallback$activity_release", "()Lkotlin/jvm/functions/Function0;", "setEnabledChangedCallback$activity_release", "(Lkotlin/jvm/functions/Function0;)V", "value", "isEnabled", "()Z", "setEnabled", "addCancellable", "cancellable", "handleOnBackCancelled", "handleOnBackPressed", "handleOnBackProgressed", "backEvent", "Landroidx/activity/BackEventCompat;", "handleOnBackStarted", "remove", "removeCancellable", "activity_release"}, m24k = 1, m23mv = {1, 8, 0}, m21xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public abstract class OnBackPressedCallback {
    private final CopyOnWriteArrayList<Cancellable> cancellables = new CopyOnWriteArrayList<>();
    private Functions<Unit> enabledChangedCallback;
    private boolean isEnabled;

    public final Functions<Unit> getEnabledChangedCallback$activity_release() {
        return this.enabledChangedCallback;
    }

    public void handleOnBackCancelled() {
    }

    public abstract void handleOnBackPressed();

    public void handleOnBackProgressed(BackEventCompat backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
    }

    public void handleOnBackStarted(BackEventCompat backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void setEnabledChangedCallback$activity_release(Functions<Unit> functions) {
        this.enabledChangedCallback = functions;
    }

    public OnBackPressedCallback(boolean z) {
        this.isEnabled = z;
    }

    public final void setEnabled(boolean z) {
        this.isEnabled = z;
        Functions<Unit> functions = this.enabledChangedCallback;
        if (functions != null) {
            functions.invoke();
        }
    }

    public final void remove() {
        for (Cancellable cancellable : this.cancellables) {
            cancellable.cancel();
        }
    }

    public final void addCancellable(Cancellable cancellable) {
        Intrinsics.checkNotNullParameter(cancellable, "cancellable");
        this.cancellables.add(cancellable);
    }

    public final void removeCancellable(Cancellable cancellable) {
        Intrinsics.checkNotNullParameter(cancellable, "cancellable");
        this.cancellables.remove(cancellable);
    }
}