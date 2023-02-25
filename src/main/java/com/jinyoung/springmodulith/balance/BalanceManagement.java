package com.jinyoung.springmodulith.balance;

import com.jinyoung.springmodulith.cycle.CycleManagement;
import com.jinyoung.springmodulith.request.RequestManagement;
import org.springframework.stereotype.Service;

@Service
public class BalanceManagement {

    final CycleManagement cycleManagement;
    final RequestManagement requestManagement;

    public BalanceManagement(CycleManagement cycleManagement, RequestManagement requestManagement) {
        this.cycleManagement = cycleManagement;
        this.requestManagement = requestManagement;
    }
}
