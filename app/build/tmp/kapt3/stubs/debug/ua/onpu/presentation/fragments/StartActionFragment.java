package ua.onpu.presentation.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\r\u001a\u00020\u000bH\u0002J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u000bH\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lua/onpu/presentation/fragments/StartActionFragment;", "Lua/onpu/base/BaseFragment;", "Lua/onpu/presentation/viewModels/StartActionViewModel;", "()V", "fragmentLayout", "", "getFragmentLayout", "()I", "listAdapter", "Lua/onpu/presentation/adapters/StartActionAdapter;", "initObservers", "", "initRecyclerView", "initToolbar", "onPrepareOptionsMenu", "menu", "Landroid/view/Menu;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "openTimerFragment", "action", "Lua/onpu/db/entity/Action;", "showToolbar", "app_debug"})
public final class StartActionFragment extends ua.onpu.base.BaseFragment<ua.onpu.presentation.viewModels.StartActionViewModel> {
    private final int fragmentLayout = ua.onpu.R.layout.fragment_start_action;
    private ua.onpu.presentation.adapters.StartActionAdapter listAdapter;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected int getFragmentLayout() {
        return 0;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initRecyclerView() {
    }
    
    private final void openTimerFragment(ua.onpu.db.entity.Action action) {
    }
    
    @java.lang.Override()
    public void initObservers() {
    }
    
    private final void initToolbar() {
    }
    
    @java.lang.Override()
    public void onPrepareOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
    }
    
    private final void showToolbar() {
    }
    
    public StartActionFragment() {
        super(null);
    }
}