package com.example.layered;

import java.util.List;

public interface MemoService {
    public MemoResponseDto saveMemo(MemoRequestDto requestDto);
    public List<MemoResponseDto> findAllMemos();
    public MemoResponseDto findMemoById(Long id);
    public MemoResponseDto updateMemo(Long id, String title, String contents);
    public MemoResponseDto updateTitle(Long id, String title, String contents);
    public void deleteMemo(Long id);
}
