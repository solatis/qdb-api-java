package com.b14.qdb.hadoop.mapreduce.examples.wordcounter;

public class Chapter {
    private final String author;
    private final String book;
    private final String chapter;
    private final String text;

    public Chapter(String author, String book, String chapter,String text) {
        this.author = author;
        this.book = book;
        this.chapter = chapter;
        this.text = text;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @return the book
     */
    public String getBook() {
        return book;
    }

    /**
     * @return the chapter
     */
    public String getChapter() {
        return chapter;
    }

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override 
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((author == null) ? 0 : author.hashCode());
        result = prime * result + ((book == null) ? 0 : book.hashCode());
        result = prime * result + ((chapter == null) ? 0 : chapter.hashCode());
        result = prime * result + ((text == null) ? 0 : text.hashCode());
        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override 
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Chapter)) {
            return false;
        }
        Chapter other = (Chapter) obj;
        if (author == null) {
            if (other.author != null) {
                return false;
            }
        } else if (!author.equals(other.author)) {
            return false;
        }
        if (book == null) {
            if (other.book != null) {
                return false;
            }
        } else if (!book.equals(other.book)) {
            return false;
        }
        if (chapter == null) {
            if (other.chapter != null) {
                return false;
            }
        } else if (!chapter.equals(other.chapter)) {
            return false;
        }
        if (text == null) {
            if (other.text != null) {
                return false;
            }
        } else if (!text.equals(other.text)) {
            return false;
        }
        return true;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override 
    public String toString() {
        return String.format("Chapter [author=%s, book=%s, chapter=%s, text=%s]", author, book, chapter, text);
    }
}
