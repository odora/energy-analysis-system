package com.flycode.readrec.service.iface;

import java.util.List;

import com.flycode.readrec.entity.TabReadRec;

public interface TabReadRecService {
	List<TabReadRec> selectByMonth(String tableName);
}
