
import feedparser
from datetime import datetime, timedelta
import re

def get_feed_entries(feed_url):
    feed = feedparser.parse(feed_url)
    return feed.entries

def filter_news(entries, days_threshold, keywords):
    filtered_news = []
    seen_urls = set()
    today = datetime.today()

    for entry in entries:
        current_date = datetime.now()
        published_date = datetime(*entry.published_parsed[:6])
        if current_date - published_date <= timedelta(days= days_threshold):
            for keyword in keywords:
                if re.search(keyword, entry.title, re.IGNORECASE) or re.search(keyword, entry.summary, re.IGNORECASE):
                    if entry.link not in seen_urls:
                        filtered_news.append({
                            'title': entry.title,
                            'url': entry.link,
                            'abstract': entry.summary
                        })
                        seen_urls.add(entry.link)
                    break

    return filtered_news

def main():
    rss_file = 'websites.txt'
    days_threshold = 31
    keywords = ['science', 'space', 'technology','school','kids','spacex','biology','physics','gravity','constellation','chemistry', 'dna','math', 'pollution','biology','electronics','programming','artificial intelligence']  # Example keywords

    with open(rss_file, 'r') as f:
        rss_urls = f.readlines()

    all_news = []
    for rss_url in rss_urls:
        entries = get_feed_entries(rss_url.strip())
        filtered_entries = filter_news(entries, days_threshold, keywords)
        all_news.extend(filtered_entries)
    print("<html><ul>")
    for news in all_news:
        print("<li><a href=",news['url'],">", news['title'],"</a> </br>")
        #print("URL:", news['url'])
        print("<strong>Abstract:</strong>", news['abstract'])
        print("</br>")
    print("</ul></html>")

if __name__ == "__main__":
    main()