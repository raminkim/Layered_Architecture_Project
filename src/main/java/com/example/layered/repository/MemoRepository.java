package com.example.layered.repository;

import com.example.layered.MemoResponseDto;
import com.example.layered.entity.Memo;

import java.util.List;

public interface MemoRepository {
    public Memo saveMemo(Memo memo);
    public List<MemoResponseDto> findAllMemos();
    public Memo findMemoById(Long id);
    public void deleteMemo(Long id);
}
