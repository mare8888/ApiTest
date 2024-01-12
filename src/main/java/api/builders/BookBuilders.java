package api.builders;

import api.dto.request.book.AddBookDto;
import api.dto.request.book.DeleteBookDto;
import api.dto.request.book.IsbnDto;

import java.util.List;

public class BookBuilders {

    public AddBookDto defaultBookDtoBuilder() {
        return AddBookDto.builder()
                .userId("eb26862b-3eda-4d3d-9da6-bfe4c4f8e764")
                .collectionOfIsbns(List.of(IsbnDto.builder().isbn("9781449331818").build()))
                .build();
    }
    public DeleteBookDto deleteBookDtoBuilder() {
        return DeleteBookDto.builder()
                .userId("eb26862b-3eda-4d3d-9da6-bfe4c4f8e764")
                .build();
    }
}
